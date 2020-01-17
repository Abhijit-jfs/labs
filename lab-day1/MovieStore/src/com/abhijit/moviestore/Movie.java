package com.abhijit.moviestore;

public class Movie {

	String movieName;
	String director;
	int runtime;
	double imdbRating;
	int releaseYear;
	
	public Movie() {
		this.movieName = "Interstellar";
		this.director = "Christopher Nolan";
		this.runtime = 169;
		this.imdbRating = 8.6;
		this.releaseYear = 2014;
	}
	
	public Movie(String movieName) {
		this(movieName, "John Doe", 100, 9.0, 2019);
	}
	
	public Movie(String movieName, String director, int runtime, double imdbRating, int releaseYear) {
		this.movieName = movieName;
		this.director = director;
		this.runtime = runtime;
		this.imdbRating = imdbRating;
		this.releaseYear = releaseYear; 
	}
	
	public void acceptDetails() {
		// TODO: use scanner
		this.movieName = "Interstellar";
		this.director = "Christopher Nolan";
		this.runtime = 169;
		this.imdbRating = 8.6;
		this.releaseYear = 2014;
	}
	
	public void displayDetails() {
		System.out.println(this.movieName);
		System.out.println(this.director);
		System.out.println(this.runtime);
		System.out.println(this.imdbRating);
		System.out.println(this.releaseYear);
	}
	
	@Override
	public String toString() {
		return this.movieName + " [" + this.director + ", IMDb: " + this.imdbRating + "/10]";
	}
}
