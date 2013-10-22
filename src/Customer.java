
public class Customer extends Person {

	String customerNumber;
	Boolean isOnMailingList;
	
	/**
	 * @param name
	 * @param address
	 * @param telephoneNumber
	 * @param customerNumber
	 * @param isOnMailingList
	 */
	public Customer(String name, String address, String telephoneNumber,
			String customerNumber, Boolean isOnMailingList) {
		super(name, address, telephoneNumber);
		this.customerNumber = customerNumber;
		this.isOnMailingList = isOnMailingList;
	}
	
	/**
	 * @param person
	 * @param customerNumber
	 * @param isOnMailingList
	 */
	public Customer(Person person, String customerNumber, Boolean isOnMailingList){
		super(person.getName(), person.getAddress(), person.getTelephoneNumber());
		this.customerNumber = customerNumber;
		this.isOnMailingList = isOnMailingList;
	}
	

	/**
	 * @return the customerNumber
	 */
	public String getCustomerNumber() {
		return customerNumber;
	}

	/**
	 * @param customerNumber the customerNumber to set
	 */
	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}

	/**
	 * @return the isOnMailingList
	 */
	public Boolean getIsOnMailingList() {
		return isOnMailingList;
	}

	/**
	 * @param isOnMailingList the isOnMailingList to set
	 */
	public void setIsOnMailingList(Boolean isOnMailingList) {
		this.isOnMailingList = isOnMailingList;
	}


	public String toString() {
		return "Customer [customerNumber=" + customerNumber
				+ ", isOnMailingList=" + isOnMailingList + "]";
	}
	
	
	
}
