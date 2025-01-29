package doublylinkedlist.moviemanagement;

public class MovieManager {
    private MovieList movieList;

    public MovieManager() {
        movieList = new MovieList();
    }

    // Add a movie at the beginning
    public void addMovieAtBeginning(Movie movie) {
        movieList.addFirst(movie);
    }

    // Add a movie at the end
    public void addMovieAtEnd(Movie movie) {
        movieList.addLast(movie);
    }

    // Add a movie at a specific position
    public void addMovieAtPosition(Movie movie, int position) {
        movieList.addAtPosition(movie, position);
    }

    // Remove a movie by title
    public void removeMovieByTitle(String title) {
        movieList.removeByTitle(title);
    }

    // Search movies by director
    public void searchMoviesByDirector(String director) {
        movieList.searchByDirector(director);
    }

    // Search movies by rating
    public void searchMoviesByRating(double rating) {
        movieList.searchByRating(rating);
    }

    // Update a movie's rating
    public void updateMovieRating(String title, double newRating) {
        movieList.updateRating(title, newRating);
    }

    // Display all movies in forward order
    public void displayMoviesForward() {
        movieList.displayForward();
    }

    // Display all movies in reverse order
    public void displayMoviesBackward() {
        movieList.displayBackward();
    }
}