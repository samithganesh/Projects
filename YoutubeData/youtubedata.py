import io
import pandas as pd
import plotly.express as px


df = pd.read_csv("most_subscribed_youtube_channels.csv")
df = df.replace(',', '', regex = True)

display(df)


df['subscribers'] = pd.to_numeric(df['subscribers'], errors = 'coerce')
df['video views'] = pd.to_numeric(df['video views'], errors = 'coerce')
df['video count'] = pd.to_numeric(df['video count'], errors = 'coerce')
df['started'] = pd.to_numeric(df['started'], errors = 'coerce')

# Histogram
fig1 = px.histogram(df, x = 'Subscribers', title = 'Subscriber Count')
fig1.show(renderer = "browser")

# Pie Chart
fig2 = px.pie(df, values = "Subscribers", names = "Category", title = "Youtube Categories")
fig2.show(renderer = "browser")


