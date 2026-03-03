package workshop.account.entity;

public class Account {
	private String custId;
	private String acctId;
	private int balance;
	
	//setter method
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void setAcctId(String acctId) {
		this.acctId = acctId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	//getter method
	public String getCustId() {
		return custId;
	}

	public String getAcctId() {
		return acctId;
	}

	public int getBalance() {
		return balance;
	}
	
	
	
}
