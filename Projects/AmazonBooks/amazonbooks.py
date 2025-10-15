import pandas as pd

df = pd.read_csv('bestsellers.csv')

print(df.head()) # Prints first 5 rows of spreadsheet
print(df.shape) # Gets shape of the spreadsheet
print(df.columns) # Gets column names of the spreadsheet
print(df.describe()) # Summary statistics for each column

df.drop_duplicates(inplace = True)

df.rename(columns={"Name": "Title", "Year": "Publication Year", "User Rating": "Rating"}, inplace=True)

df["Price"] = df["Price"].astype(float)


# Analysis
# Which authors have the most books on the Amazon Best Sellers List
author_counts = df['Author'].value_counts()
print(author_counts)

# Average Rating by Genre
avg_rating_by_genre = df.groupby("Genre")['Rating'].mean()
print(avg_rating_by_genre)
