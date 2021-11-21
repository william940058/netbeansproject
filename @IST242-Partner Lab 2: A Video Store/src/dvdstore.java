
public class dvdstore {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// TODO code application logic here
		VideoStore vs = new VideoStore("william");

		String storeName = "William's";

		System.out.println("Welcome to " + storeName + " video store!!");
		System.out.println("--------------------------------");

		vs.addMovie("The monk", 5);

		vs.addMovie("The punk", 5);

		vs.addMovie("The god", 10);

		vs.addCustomer(5, "John", "Doe", 9000);

		vs.addCustomer(9, "Johnny", "Moe", 1000);

		vs.addRental("The monk", 5);

		vs.addRental("The god", 5);

		vs.addRental("The god", 9);

		vs.showAll();
	}

}
