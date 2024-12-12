# Unit 4 - Abstract Art Project

## Introduction

Data visualizations are powerful tools to present information and convey patterns and relationships. Sometimes visualizations are charts or graphs, and other times they are more abstract pieces of art. Your goal is to create a visual representation relating at least two categories from your dataset that engages your viewer and encourages them to learn more about your chosen topic.

## Dataset

The dataset was artificially generated using ChatGPT.
    •	Movie Names (String): The name of the movie.
	•	Ratings (double): A numerical rating of the movie from 1 to 10.
	•	Years (int): The year the movie was released.
	•	Genres (String): The genre of the movie (e.g., Drama, Action, Sci-Fi).

## UML Diagram

<img width="904" alt="Screenshot 2024-12-12 at 6 49 42 AM" src="https://github.com/user-attachments/assets/270f7841-55d5-4c3c-8afc-7fd2b3513795" />

## Video Demo

<img width="406" alt="Screenshot 2024-12-12 at 6 50 05 AM" src="https://github.com/user-attachments/assets/2b21aaa1-07a8-47c6-8390-5f03ceee3147" />

https://drive.google.com/file/d/17tgbxMq-jUJrOeU-OjncjKjV9Q0nf8mA/view?usp=sharing

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
 The X coordinate of the square is used to sort the items by genre

This program highlights the patterns in data through size (rating), position (year and genre), and sound (notes based on rating category). It encourages viewers to explore trends while enjoying an interactive visualization.
