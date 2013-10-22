
public class PreferedCustomer extends Customer {

	double customerPurchases;
	double discountRate;
	
	/**
	 * @param name - the name of the customer
	 * @param address - the customer's address
	 * @param telephoneNumber - the customer's telephone number
	 * @param customerNumber - the customer's number
	 * @param isOnMailingList - if the customer is on the mailing list or not
	 */
	public PreferedCustomer(String name, String address,
			String telephoneNumber, String customerNumber,
			Boolean isOnMailingList) {
		super(name, address, telephoneNumber, customerNumber, isOnMailingList);
	}
	
	/** Customer-built Constructor | This will build a PreferedCustomer using an existing customer
	 * @param customer - the customer
	 */
	public PreferedCustomer(Customer customer){
		super(customer, customer.customerNumber, customer.isOnMailingList);
	}
	
	
	/** Add the purchase to the customers total purchases
	 * @param amount - the amount of the customer's purchase
	 */
	public void addToPurchases(double amount){
		customerPurchases += amount;
		discountRate = calculateDiscountRate();
	}
	
	/** Calculate the discount rate of the customer by checking their total purchases
	 * @return - the discount rate
	 */
	private double calculateDiscountRate(){
		if(customerPurchases > 2000)
			return .1;
		else if(customerPurchases >= 1500 && customerPurchases < 2000)
			return .07;
		else if(customerPurchases >= 1000 && customerPurchases < 1500)
			return .06;
		else 
			return .05;
	}


	/**
	 * @return the customerPurchases
	 */
	public double getCustomerPurchases() {
		return customerPurchases;
	}


	/**
	 * @param customerPurchases the customerPurchases to set
	 */
	public void setCustomerPurchases(double customerPurchases) {
		this.customerPurchases = customerPurchases;
	}


	/**
	 * @return the discountRate
	 */
	public double getDiscountRate() {
		return discountRate;
	}


	/**
	 * @param discountRate the discountRate to set
	 */
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}


	public String toString() {
		return "PreferedCustomer [customerPurchases=" + customerPurchases
				+ ", discountRate=" + discountRate + "]";
	}
	
	
	
}
