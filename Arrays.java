 
 //Practice on 1D-Arrays.
 
 import java.util.Scanner;
 public class Arrays {
	 
	 static void test(int var1, int var2){
		 int[] set1 = new int[6];
		 set1[0] = 6; set1[1] = 23; set1[2] = 45; set1[3] = 88;
		 set1[4] = 90; set1[5] = 883;
		 
		 set1[0] = var1; set1[3] = var2;
		 
		 System.out.println("This is the list of number in the given array");
		 for (int i = 0; i < set1.length; i++){
			 System.out.printf("%d ",set1[i]);
		 }
		 System.out.println(" ");
		 System.out.printf("The lenght of this array is: %d%n", set1.length);
		 //System.out.println(set1);
	 }
	 
	 static void stringArray(/*String var1, String var2*/){
		 String[] set2 = new String[6];
		 set2[0] = "Eric"; set2[1] = "Dane"; set2[2] = "Michelle"; set2[3] = "Claude";
		 set2[4] = "Mike"; //set2[5] = "Nanna";
		 
		 for (int s = 0; s < set2.length; s++){
			 System.out.printf("%s ", set2[s]);
		 }
		 
		 System.out.println(" ");
		 String test1 = "Trial ";
		 System.out.printf("The lenght of %s is %d%n", test1, test1.length());
	 }
	 
	 
	 public static void main(String[] args){
		 System.out.println("Setup is ready and you are ready to go!!!");
		 
		 Scanner user_input = new Scanner(System.in);
		 System.out.print("Enter first variable: ");
		 int var1 = user_input.nextInt();
		 
		 System.out.print("Enter seconf variable: ");
		 int var2 = user_input.nextInt();
		 test(var1, var2);
		 
		 stringArray();
		 
		 int[] list = {10, 20, 30, 40};
		 printArray(list);//Passing arrays as argument to methods
	 }
	 
	 //Read on pass by value and pass by reference
	 
	 ///Passing arrays as arguments
	 public static void printArray(int[] array){
		 for (int i = 0; i < array.length; i++){
			 System.out.println(array[i]);
		 }
		 
	 }
 }
 /*
 class MDarrays {
	 These are arrays that can be said as a an array of arrays. Basically, an array that can 
	 contain other arrays. 
	 NB: Note that muti-dimentional arrays have to be of the same data type.
	 
	 3g: Multi-dimentionl array creation
	 
	 int[][][] a = new int[][][]
	 datatype[][][](The number of possible nested arrays represented by []) = new datatype [][][](The lenght of each array.)
	 
	 -->> Rows by columns
	 
	 
	 -> In java, multi-dimentional arrays are not represented as tables but rather an array of arrays
	 
 }
 */