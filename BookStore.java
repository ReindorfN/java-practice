
//Practice on method overloading.

public class BookStore {
	
	static void displayBookInfo(String title, double price) {
		System.out.printf("Title:%-20s price $%.2f%n", title, price);
		
	}
	
	static void displayTrial(String sentence, int integer) {
		System.out.printf("This is a string: %-5s%n", sentence);
		//System.out.println("");
		System.out.printf("This is an integer: -%d", integer);
		System.out.println();
	}
	
	static void displayTrial(int integer, String sentence) {
		System.out.printf("This is an integer: -%d\n", integer);
		//System.out.println("");
		System.out.printf("This is a string: %-5s", sentence);
		
		
		//System.out.printf("This is the age %
	}
	
	public static void main(String[] args){
		BookStore bookstore = new BookStore();
		displayBookInfo("Java Fundamentals", 59.99);
		displayTrial("It is good for my own good", 14);
		displayTrial(15, "This is good");
	}
}


class Overloading {
	
	static void cohort(String name, int student_number){
		System.out.printf("The cohort name is: %-5s and they are %d%n", name, student_number);
		
	}
	
	static int cohort(int students) {
		int school_number = students + 500;
		//String printout = System.out.printf("Student number is %d%n");
		
		return school_number;
	}
	
	static String cohort(int value, String name) {
		String format = String.format("Number with leading zeros: %06d%n", value);
		System.out.print(format);
		return format;
	}
	
	public static void main(String args[]) {
		int another = cohort(40);
		System.out.printf("The output is %-10s%n", another);
		cohort("Class of 2026", 350);
		cohort(230, "Ama");
	}
}