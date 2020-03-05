package _05_netflix;

import javax.swing.JOptionPane;

public class netflix {
public static void main(String[] args) {
	Movie jo=new Movie("John Wick 3", 5);
	Movie pu=new Movie("John Wick 1", 2);
	Movie uy=new Movie("Enemies at the Gate", 3);
	Movie op=new Movie("Mission Impossible 6", 4);
	Movie jq=new Movie("JohnWick 2", 1);
	System.out.println(jo.getTicketPrice());
	NetflixQueue u=new NetflixQueue();
	u.addMovie(jo);
	u.addMovie(pu);
	u.addMovie(uy);
	u.addMovie(op);
	u.addMovie(jq);
	u.printMovies();
	System.out.println(u.getBestMovie());
	u.sortMoviesByRating();
	System.out.println(u.getMovie(1));
	
}
}
