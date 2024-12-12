# Unit 4 - Abstract Art Project

## Introduction

Data visualizations are powerful tools to present information and convey patterns and relationships. Sometimes visualizations are charts or graphs, and other times they are more abstract pieces of art. Your goal is to create a visual representation relating at least two categories from your dataset that engages your viewer and encourages them to learn more about your chosen topic.

## Requirements

Use your knowledge of object-oriented programming, one-dimensional (1D) arrays, and algorithms to create your data visualization program:

- **Create at least two 1D arrays** – Create at least two 1D arrays to store the data that will make up your visualization.
- **Implement one or more algorithms** – Implement one or more algorithms that use two-way or multi-selection statements with compound Boolean expressions to analyze the data.
- **Use methods in the Math class** – Use one or more methods in the Math class in your program, such as to perform calculations on the values in your dataset and display the results, choose random values from the dataset, or display images or shapes at random locations.
- **Create a visualization** – Create an image or animation that conveys the story of the data by illustrating the patterns or relationships in the data.
  Note: This may be abstract! Others do not necessarily need to know what the story or pattern is right away, but you do need to be able to explain it to them.
- **Document your code** – Use comments to explain the purpose of the methods and code segments and note any preconditions and postconditions.

## Dataset

The dataset was artificially generated using ChatGPT.
    •	Movie Names (String): The name of the movie.
	•	Ratings (double): A numerical rating of the movie from 1 to 10.
	•	Years (int): The year the movie was released.
	•	Genres (String): The genre of the movie (e.g., Drama, Action, Sci-Fi).

## UML Diagram

Put and image of your UML Diagram here. Upload the image of your UML Diagram to your repository, then use the Markdown syntax to insert your image here. Make sure your image file name is one work, otherwise it might not properly get display on this README.

![UML Diagram for my project](nameOfImageFileHere.png)

## Video Demo


[![Thumbnail for my projet](nameOfThumbnail.png)](youtube-URL-here)

## Description

This project visualizes data from a movie dataset using an abstract art animation. Each rectangle represents a movie and is sized, positioned, and colored based on the movie’s rating, year, and genre.

User Story:

A movie enthusiast wants to see an abstract representation of their movie data that shows trends in ratings, release years, and genres.

Class Concepts:
	•	Encapsulation: The DataScene class encapsulates all data and visualization logic.
	•	1D Arrays: Used to store movie data (names, ratings, years, genres).
	•	Algorithms: Sorting movies into categories (good, mid, bad) using multi-selection statements and compound Boolean expressions.
	•	Math Methods:
        •	Math.pow: Scales years for y-coordinates.
        •	Math.random: Generates random notes and colors.
        •	Math.round: Rounds ratings for size calculations.
	•	Visualization: Abstract art showing relationships between movie data.

This program highlights the patterns in data through size (rating), position (year and genre), and sound (notes based on rating category). It encourages viewers to explore trends while enjoying an interactive visualization.