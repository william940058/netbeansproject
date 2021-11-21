
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class VideoStore {

	private String storeName;
	private HashSet<Customer> customers = new HashSet();
	private ArrayList<Movie> movies = new ArrayList();
	private HashMap<Customer, Movie> customersHaveRentedMovies = new HashMap();

	public VideoStore(String storeName) {
		this.storeName = storeName;
	}

	public void addMovie(String movieTitle, int copiesRemaining) {
		movies.add(new Movie(movieTitle, copiesRemaining));
	}

	public void updateMovie(String movieTitle, int copyRemaining) {
		Movie tempMovie = new Movie(movieTitle, copyRemaining);
		Iterator iter = movies.iterator();
		Movie foundMovie = null;
		while (iter.hasNext()) {
			foundMovie = (Movie) iter.next();
			if (foundMovie.equals(tempMovie)) {
				movies.remove(tempMovie);
				movies.add(tempMovie);
			}
		}
	}

	public void addCustomer(int customerID, String firstName, String lastName, double accountBalance) {
		customers.add(new Customer(customerID, firstName, lastName, accountBalance));
	}

	public void updateCustomer(int customerId, String firstName, String lastName, double accountBalance) {
		Customer tempCust = new Customer(customerId, firstName, lastName, accountBalance);
		Iterator iter = customers.iterator();
		Customer foundCust = null;
		while (iter.hasNext()) {
			foundCust = (Customer) iter.next();
			if (foundCust.equals(tempCust)) {
				customers.remove(tempCust);
				customers.add(tempCust);
			}
		}
	}

	public boolean addRental(String movieTitle, int customerId) {
		Movie movieInStock = null;
		for (Movie m : movies) {
			if (m.getMovieTitle().equalsIgnoreCase(movieTitle)) {
				if (m.getCopyRemaining() < 1) {
					System.out.println("No copies available");
					return false;
				}
				movieInStock = new Movie(m.getMovieTitle(), m.getCopyRemaining() - 1);
			}
		}
		if (movieInStock == null) {
			System.out.println("Movie is not in stock");
			return false;
		}

		for (Customer c : customers) {
			if (c.getCustomerId() == customerId) {
				customersHaveRentedMovies.put(c, movieInStock);
				movies.add(movieInStock);
				movies.remove(movieInStock);
				return true;
			}

		}

		return true;

	}

	public void showAll() {
		System.out.println("");
		for (Movie m : movies) {
			System.out.println(m);
		}
		for (Customer c : customers) {
			System.out.println(c);
		}
		System.out.println("--------");
		Iterator mapIter = customersHaveRentedMovies.entrySet().iterator();

		while (mapIter.hasNext()) {
			Map.Entry pair = (Map.Entry) mapIter.next();
			System.out.println(pair.getKey());
			System.out.println(pair.getValue());
		}
	}
}
