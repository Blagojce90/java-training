package opp;

public class BankAccount {
	//Define variables
	String accountNumber;
	
	private static final String routingNumber = "013546";         
	
	
	private String name;
	private String ssn;
	String accountType;
	double balance = 0;
	
	//Constructor definitions: unique methods
	// 1.There are used to define/setup/initialize properties of an object
	// 2. Constructors are IMPLICITY callaed upon INSTATIATON
	// 3. The same name as the class itself
	// 4. Constructors hane NO return type
	
	BankAccount () {
		
		System.out.println("NEW ACCOUNT CREATED");
	}
	
	//Overloading  call same methhod name with different arguments
	
	BankAccount(String accountType) {
		
		System.out.println("NEW ACCOUNT: " + accountType);
		
	}
	
	BankAccount(String accountType, double initDeposite) {
		
		System.out.println("NEW ACCOUNT: " + accountType);
		System.out.println("INITIAL DEPOSITE OF: $ " + initDeposite);
		String Msg = null;
		if (initDeposite < 1000) {
			Msg = "ERROR: Minimum deposite must be at least 1000$";
		}else {
			Msg = "Thanks for your initial deposit of: $ " + initDeposite;
		}
		System.out.println(Msg);
		balance = initDeposite;
		
	}
	//Getters / Setters
	
	//Allow the usre to define the name
	public void setName (String name) {
		this.name = "Mr. " + name;
	}
	public String getName() {
		return name;
	}
	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	
	
	
	//Define methods
	public void deposit(double amount) {
		balance = balance + amount;
		showActivity("DEPOSIT");
		
	}
	
	void withdraw(double amount) {
		balance = balance + amount;
		showActivity("WITHDRAW");
	}
	
	private void showActivity(String activity) {
		System.out.println("YOUR RECENT TRANSACTION: " + activity);
		System.out.println("YOUR NEW BALANCE IS: $ " + balance);
	}
	
	void chekBalance() {
		
		System.out.println("BLANCE: " + balance);
		
	}
	
	void getStatus() {
		
	}
	
	@Override
	public String toString() {
		
		return "[ NAME:  " + name + ", ACOUNT#  " + accountNumber + ", ROUTING#" + routingNumber + " .BALANCE: $ " + balance + "] ";
	}

}
