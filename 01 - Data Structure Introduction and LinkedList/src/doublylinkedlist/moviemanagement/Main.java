package doublylinkedlist.moviemanagement;

/**
 * Main class to demonstrate the Movie Management System.
 */
public class Main {
    public static void main(String[] args) {
        MovieManager manager = new MovieManager();

        // Add movies
        manager.addMovieAtBeginning(new Movie("Inception", "Christopher Nolan", 1997, 7.9));
        manager.addMovieAtBeginning(new Movie("Titanic", "James Cameron", 19, 8.8));
        manager.addMovieAtEnd(new Movie("The Dark Knight", "Christopher Nolan", 2008, 9.0));
        manager.addMovieAtEnd(new Movie("The Shawshank Redemption", "Frank Darabont", 1994, 9.3));
        manager.addMovieAtPosition(new Movie("Interstellar", "Christopher Nolan", 2014, 8.6), 1);

        // Display movies
        System.out.println("Movies in forward order:");
        manager.displayMoviesForward();
        System.out.println("Movies in reverse order:");
        manager.displayMoviesBackward();

        // Search movies
        System.out.println("Movies by Christopher Nolan:");
        manager.searchMoviesByDirector("Christopher Nolan");
        System.out.println("Movies with rating 8.8:");
        manager.searchMoviesByRating(8.8);

        // Update rating
        manager.updateMovieRating("Inception", 9.2);

        // Remove a movie
        manager.removeMovieByTitle("The Dark Knight");
        System.out.println("Movies after removal:");
        manager.displayMoviesForward();
    }
}