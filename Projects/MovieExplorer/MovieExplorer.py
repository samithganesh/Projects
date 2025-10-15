from flask import Flask, render_template, request, jsonify
import pandas as pd
import numpy as np
import os


app = Flask(__name__)

CSV_PATH = os.path.join(os.path.dirname(__file__), "movies.csv")

def load_data():
    df = pd.read_csv(CSV_PATH)
    # Ensure numeric ratings and drop invalid rows
    df['rating'] = pd.to_numeric(df['rating'], errors = 'coerce')
    df = df.dropna(subset = ['rating'])
    return df

df = load_data()

@app.route("/")
def index():
    return render_template('index.html')

@app.route("/genres")
def get_genres():
    genres = sorted(df['genre'].dropna().unique().tolist())
    return jsonify(genres)

@app.route("/top_movies")
def get_top_movies():
    genre = request.args.get('genre')
    n = int(request.args.get('n', 10))
    filtered = df[df['genre'] == genre] if genre else df
    top = filtered.sort_values('rating', ascending=False).head(n)
    return jsonify(top[['title', 'rating', 'year']].to_dict(orient = 'records'))

@app.route("/avg_by_genre")
def avg_by_genre():
    avg = df.groupby('genre')['rating'].mean().reset_index()
    avg = avg.sort_values('rating', ascending = False)
    return jsonify(avg.to_dict(orient = 'records'))

@app.route("/ratings_distribution")
def ratings_distribution():
    genre = request.args.get('genre')
    filtered = df[df['genre'] == genre] if genre else df
    bins = np.arange(0,11,1)
    counts, bin_edges = np.histogram(filtered['rating'], bins = bins)
    labels = [f"{int(bin_edges[i])}–{int(bin_edges[i+1])}" for i in range(len(bin_edges)-1)]
    return jsonify({"bins": labels, "counts": counts.tolist()})

if __name__ == "__main__":
    app.run(debug = True)
    