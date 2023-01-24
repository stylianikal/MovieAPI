package gr.unipi.movieapi;

import gr.unipi.movieapi.services.MovieAPIService;

public class MovieAPI {

	public static MovieAPIService getMovieDBService() {
		// API key needed. Register and generate API KEY
		return new MovieAPIService("https://api.themoviedb.org/", "f28fda5b501940bcadf286e0b0fa63a7");
	}
	
}
