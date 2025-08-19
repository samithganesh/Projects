import pandas as pd
import numpy as np
import matplotlib.pyplot as plt
import seaborn as sns

# Load in csv file and inspect data
df = pd.read_csv("AB_NYC_2019.csv")
print("df.head()")
print(df.head())
print("df.info()")
print(df.info())
print("df.describe()")
print(df.describe())

# Clean the data
print(df.isnull().sum())
df = df[df['price'] < 1000]
df = df[df['minimum_nights'] < 365]

# EDA
sns.countplot(x="neighbourhood_group", data = df) # Manhattan and Brooklyn hae the most Airbnbs by far
sns.countplot(x="room_type", data = df) # Entire homes/apts and private rooms are much more common that shared rooms

# Shows average price by room type and borough
sns.barplot(x= "room_type", y = "price", hue = "neighbourhood_group", data = df)


plt.figure(figsize = (10,6))
plt.hist(df['price'], bins = 50, edgecolor = "black")
plt.title("Distribution of Airbnb Prices in NYC") # Most listings are less than or around $100
plt.xlabel("Price")
plt.ylabel("# of Listings")
plt.xlim(0,500) # Removes any extreme outliers
plt.show()
