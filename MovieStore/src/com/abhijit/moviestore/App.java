package com.abhijit.moviestore;

import java.util.ArrayList;
import java.util.Arrays;

import Movie;

public class App {

	public static void main(String[] args) {
		Movie movie = new Movie();
		// movie.acceptDetails();
		movie.displayDetails();

		System.out.println("********************");
		movie = new Movie("Ad Astra", "James Gray", 124, 6.7, 2019);
		// movie.acceptDetails();
		movie.displayDetails();
		System.out.println("********************");
		System.out.println(movie);
		System.out.println("******************** enhanced for loop");
		Movie movies[] = new Movie[2];
		movies[0] = new Movie("The VVitch");
		movies[1] = new Movie("Arrival");
		Movie moviesNew[] = Arrays.copyOf(movies, 3);
		moviesNew[2] = new Movie("Knives Out");
		
		for (Movie m : movies) {
			System.out.println(m);
		}
		System.out.println("******************** using arraylist");
		ArrayList movieList = new ArrayList();
		movieList.add(moviesNew[0]);
		movieList.add(moviesNew[1]);
		movieList.add(moviesNew[2]);
		System.out.println(movieList);
	}
}
