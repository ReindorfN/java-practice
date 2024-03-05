/* A program to compute the area of a circle

*/
// imports
import java.util.Scanner; //The import class is used to take user input

class Area_Circle{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in); /*The new keyword creates a new object of a class.
		In this case, it is creating an object of the Scanner class.*/
		System.out.print("Input radius: ");
		
		float radius = input.nextFloat();
		//float radius = 6.71F;
		
		float area; //A float can automatically be converted to a double but not vice-versa
	  /*double area;
		area = 3.14159 * radius * radius
		*/
		area = (float)3.14159 * radius * radius; /*This is a simple way to convert the entire computation to a float.
		This is called type casting*/
		
		System.out.println("The area with radius "+ radius + " is: " + area);
		
		input.close();//It is a good practice to cloase the scanner.
	}
}