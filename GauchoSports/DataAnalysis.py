# %%
from readline import redisplay
import pandas as pd # type: ignore
import matplotlib.pyplot as plt # type: ignore
import seaborn as sns #type: ignore

df = pd.read_csv('/Users/ganesh/Desktop/players.csv')
display(df.head()) # type: ignore
display(df.describe()) # type: ignore

# Histograms that show the distribution for points, assists, and rebounds
plt.figure(figsize = (10,5))
sns.histplot(df['PPG'], kde=True, bins=100)
plt.title("Distribution of Points Per Game")
plt.xlabel("Points")
plt.show()

plt.figure(figsize = (10,5))
sns.histplot(df['APG'], kde=True, bins=100)
plt.title("Distribution of Assists Per Game")
plt.xlabel("Assists")
plt.show()

plt.figure(figsize = (10,5))
sns.histplot(df['RPG'], kde=True, bins=100)
plt.title("Distribution of Rebounds Per Game")
plt.xlabel("Rebounds")
plt.show()

# Top Performers
top_scorers = df.sort_values('PPG', ascending=False).head(10)
display(top_scorers[['PLAYER', 'PPG']]) #type: ignore

top_scorers = df.sort_values('APG', ascending=False).head(10)
display(top_scorers[['PLAYER', 'APG']]) #type: ignore

top_scorers = df.sort_values('RPG', ascending=False).head(10)
display(top_scorers[['PLAYER', 'RPG']]) #type: ignore

top_scorers = df.sort_values('USG', ascending=False).head(10)
display(top_scorers[['PLAYER', 'USG']]) #type: ignore


# Relationship between Conference and Different Stats
sns.scatterplot(x='CONF', y='PPG', data=df, alpha=0.6)
plt.title("Conference vs. PPG")
plt.show()

sns.scatterplot(x='CONF', y='APG', data=df, alpha=0.6)
plt.title("Conference vs. APG")
plt.show()

sns.scatterplot(x='CONF', y='RPG', data=df, alpha=0.6)
plt.title("Conference vs. RPG")
plt.show()
# %%
