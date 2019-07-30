package AdvanceJava;

public class Bank {
	public String customerName;
	public String EmailAddress;
	public int PhoneNumber;
	public int AccountNumber;
	public double Balance;
	
	public Bank (String new_customerName, String new_EmailAddress, int new_PhoneNumber, int new_AccountNumber, double new_Balance   ) {
		
		customerName = new_customerName;
		EmailAddress = new_EmailAddress;
		PhoneNumber = new_PhoneNumber;
		AccountNumber = new_AccountNumber;
		Balance = new_Balance;
	}
	
	
	public void depositfund(double newBalance) {
		//double Previous_Balance = Balance;
		if(newBalance<50) {
		Balance = Balance+newBalance; 
		}
		else {
			System.out.println("you cannot deposit more then $50");
		}
		
		
	}
	public void withdrawfund(double money) {
		if (money <Balance) {
		Balance = Balance-money;
		}
		else {
			System.out.println("value exceeds balance");
		}
	}
	
	public void printfields() {
		System.out.println(customerName);
		System.out.println(EmailAddress);
		System.out.println(PhoneNumber);
		System.out.println(AccountNumber);
		System.out.println(Balance);
		
		
		
	}
	
	

}
