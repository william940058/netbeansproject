
import java.util.Objects;

public class Customer {
	private int customerId;
	private String firstName;
	private String lastName;
	private double accountBalance;

	public Customer(int customerId, String firstName, String lastName, double accountBalance) {
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.accountBalance = accountBalance;

	}

	public int getCustomerId() {

		return customerId;
	}

	public String getFirstName() {

		return firstName;
	}

	public String getLastName() {

		return lastName;
	}

	public double getBalance() {

		return accountBalance;
	}

	@Override
	public String toString() {
		return "CustomerID: " + customerId + " Name: " + firstName + " " + lastName + ". AccountBalance: "
				+ accountBalance;
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 89 * hash + this.customerId;
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final Customer other = (Customer) obj;
		if (this.customerId != other.customerId) {
			return false;
		}
		return true;
	}

}
