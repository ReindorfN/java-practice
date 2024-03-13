
// Program that manages cash transactions.

//Imports
import java.util.Scanner;


public class EssentialsStore {
	static double computeChangeBreakdown(double itemsCost, double amountPaid) {
		double balance = (amountPaid - itemsCost);
		
		//Cedi sign
		char cediSign = '\u20B5';
		System.out.printf("The balance is %c%.2f%n", cediSign,balance);
		
		//Breakdpwn to denominations
		double remainingAmount = balance;
		
		
		//char cediSign = '\u20B5';
		
		// Number of 200 cedi notes
		
		int twoHundredNotes = (int)(remainingAmount / 200); //finding number of 200 cedi notes
		remainingAmount = remainingAmount % 200; //finding the remaining amount after taking the 200 cedi notes out.
		if (twoHundredNotes >0){
			System.out.printf("The balance has %c%d 200 cedi notes, %n", cediSign, twoHundredNotes);}
		
		//Number of 100 cedi notes 
		int oneHundredNotes = (int)(remainingAmount / 100);
		remainingAmount = remainingAmount % 100;
		if (oneHundredNotes > 0){
			System.out.printf("The balance has %c%d 100 cedi notes, %n", cediSign, oneHundredNotes);}
		
		//Number of 50 cedi notes
		int fiftyNotes = (int)(remainingAmount / 50);
		remainingAmount = remainingAmount % 50;
		if (fiftyNotes > 0){
			System.out.printf("The balance has %c%d 50 cedi notes, %n", cediSign, fiftyNotes);}
		
		// Number of 20 cedi notes
		int twentyNotes = (int)(remainingAmount / 20);
		remainingAmount = remainingAmount % 20;
		if (twentyNotes > 0){
			System.out.printf("The balance has %c%d 20 cedi notes, %n", cediSign, twentyNotes);}
		
		//Number of 10 cedi notes
		int tenNotes = (int)(remainingAmount / 10);
		remainingAmount = remainingAmount % 10;
		if (tenNotes > 0){
			System.out.printf("The balance has %c%d 10 cedi notes, %n", cediSign, tenNotes);}
		
		//Number of 5 cedi notes
		int fiveNotes = (int)(remainingAmount / 5);
		remainingAmount = remainingAmount % 5;
		if (fiveNotes > 0){
			System.out.printf("The balance has %c%d 5 cedi notes, %n", cediSign, fiveNotes);}
		
		//Number of 2 cedi notes
		int twoNotes = (int)(remainingAmount / 2);
		remainingAmount = remainingAmount % 2;
		if (twoNotes > 0){
			System.out.printf("The balance has %c%d 2 cedi notes, %n", cediSign, twoNotes);}
		
		//Number of 1 cedi notes
		int oneNotes = (int)(remainingAmount / 1);
		remainingAmount = remainingAmount % 1;
		if (oneNotes > 0){
			System.out.printf("The balance has %c%d 1 cedi notes, %n", cediSign, oneNotes);}
		
		//Number of 50 pessewas
		int fiftyPessewas = (int)(remainingAmount / 0.5);
		remainingAmount = remainingAmount % 0.5;
		if (fiftyPessewas > 0){
			System.out.printf("The balance has %d 50 pessewas %n", fiftyPessewas);}
		
		//Number of 20 pessewas
		int twentyPessewas = (int)(remainingAmount / 0.2);
		remainingAmount = remainingAmount % 0.2;
		if (twentyPessewas > 0){
			System.out.printf("The balance has %d 20 pessewas, %n", twentyPessewas);}
		
		//Number of 10 pessewas
		int tenPessewas = (int)(remainingAmount / 0.1);
		remainingAmount = remainingAmount % 0.1;
		if (tenPessewas > 0){
			System.out.printf("The balance has %d 10 pessewas, %n", tenPessewas);}
		
		//printouts
		
		System.out.printf("Remainder is: %.2f%n", remainingAmount);
		return balance;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Store name: Essentials groceries store");
		System.out.println("Sevice details");
		
		//Taking inputs for price and amount paid
		System.out.print("Total cost of items: ");
		double itemsCost = input.nextDouble();
		System.out.print("Amount paid: ");
		double amountPaid = input.nextDouble();
		
		computeChangeBreakdown(itemsCost, amountPaid);
		
	}
}