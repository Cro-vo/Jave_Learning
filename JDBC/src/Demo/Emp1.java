package Demo;

public class Emp1 {
	
	private Integer id;
	private String name;
	private Double balance;
	
	@Override
	public String toString() {
		return "Emp1 [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
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
	 * @return the balance
	 */
	public Double getBalance() {
		return balance;
	}

	/**
	 * @param balance the balance to set
	 */
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	
	
}
