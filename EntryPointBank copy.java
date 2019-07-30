package AdvanceJava;
import java.util.Scanner;
public class EntryPointBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank person = new Bank("gurpreet","abc@gmail.com",209345345,123456789,50.0);
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		
		while (true) {
			//person.printfields();
			System.out.println("Enter 1 to give Account Balanace");
			System.out.println("Enter 2 to deposit money ");
			System.out.println("Enter 3 to withdraw money");
			int A = reader.nextInt();
		
			switch(A) {
		
			case 1:
				person.printfields();
				break;
			case 2:
				System.out.println("enter amount to be depodit:");
				int B=reader.nextInt();
				person.depositfund(B);
				break;
			case 3:
				System.out.println("enter amount to be withdraw:");
				int C=reader.nextInt();
				person.withdrawfund(C);
		
			}
		}
	}

}
