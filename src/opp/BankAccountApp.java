package opp;

public class BankAccountApp {

	public static void main(String[] args) {
		//creating a new bank account >> think instantiate an object
		
		BankAccount acc1 = new BankAccount();
	     //acc1.nae = "Roger Hue";
		 //With Encapsulation
		acc1.setName("Roger Hue");
		System.out.println(acc1.getName());
		acc1.setSsn("843633899");
		System.out.println(acc1.getSsn());
		
		acc1.accountNumber = "0168948";
	    acc1.balance = 10000;
		
		acc1.deposit(1500);
		acc1.deposit(1500);
		acc1.deposit(1500);
		acc1.withdraw(2000);


		
		
		
		
		System.out.println(acc1.toString());
		/*
		BankAccount acc2 = new BankAccount("Cheking Account");
		acc2.accountNumber = "0103912";
		
		BankAccount acc3 = new BankAccount("Savings Account", 5000);
		acc3.accountNumber = "0301391";
		acc3.chekBalance();
		
		
		//Demo fot inheritance
		CDAccount cd1 = new CDAccount();
		cd1.balance = 3000;
		cd1.interestRate = "4.5";
		cd1.name = "Juan";
		cd1.accountType = "CD Account";
		System.out.println(cd1.toString());
		cd1.compount();
         */
		
		

	}

} 