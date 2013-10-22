
public class Person {

	String name, address, telephoneNumber;

	/**
	 * @param name
	 * @param address
	 * @param telephoneNumber
	 */
	public Person(String name, String address, String telephoneNumber) {
		super();
		this.name = name;
		this.address = address;
		this.telephoneNumber = telephoneNumber;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the telephoneNumber
	 */
	public String getTelephoneNumber() {
		return telephoneNumber;
	}

	/**
	 * @param telephoneNumber the telephoneNumber to set
	 */
	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}
	
	
	public String toString() {
		return "Person [name=" + name + ", address=" + address
				+ ", telephoneNumber=" + telephoneNumber + "]";
	}

	
	
	
	
	
}
