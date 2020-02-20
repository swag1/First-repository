import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String movieTitle = "";
String movieRating = "";
int numTicketsSold = 0;
int yOrN = 1;
		Scanner keyboard = new Scanner(System.in);
		
		Movie detailsOfMovie = new Movie();
		
		
		
		//System.out.println("Type 1 to begin adding movies:");
		//yOrN = keyboard.nextInt();
		
		
		while (yOrN==1) {
			System.out.println("Enter the name of a movie:");
		    movieTitle = keyboard.next();
		    detailsOfMovie.setTitle(movieTitle);
			System.out.println("Enter the rating of the movie:");
			movieRating = keyboard.next();
			  detailsOfMovie.setRating(movieRating);
			System.out.println("Enter the number of tickets sold for this movie:");
			numTicketsSold = keyboard.nextInt();
			 detailsOfMovie.setSoldTickets(numTicketsSold);
			//System.out.println("The movie you entered was: "+ detailsOfMovie.movieTitle);
			
			//System.out.println("The rating for this movie you entered was: "+ detailsOfMovie.movieRating);
			
			//System.out.println("The number of tickets entered sold for this movie was: "+ detailsOfMovie.numTicketsSold);
			
			System.out.println("Would you like to enter another movie? (enter 1 for yes or 2 for no.");
			yOrN = keyboard.nextInt();
		
			System.out.println(detailsOfMovie.toString());
		}
		
		
		System.out.println("Good bye.");

		
	}

}

