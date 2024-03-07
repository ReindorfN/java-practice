
//import java.util.random;

class MDArrayTest{
	public static void main(String[] args){
		
		//2 dimensional arrays
		//int[][] a = new int[2][2]; // one way
		
		/*int[][] a = new int[2][]; //another way where I can seperately assign the sixe of the 2nd D arrays
		a[0] = new int[2];
		a[1] = new int[3];
		
		a[0][0] = 31; a[0][1] = 32; 
		a[1][0] = 33; a[1][1] = 34; //a[1][2] = 5;
		System.out.println(a[0][0]);
		System.out.println(a[0][1]);
		System.out.println(a[1][0]);
		System.out.println(a[1][1]);
		System.out.println(a[1][2]);
		System.out.println(a[0]);
		System.out.println(a[1]);
		*/
		
		
	}
}

//printing matrices
class matrixPrint{
	public static void main(String[] args){
		int[][] matrix = {{34, 35, 46, 48,521},{38,584,354, 46, 48,25}, {36, 99, 100, 2000}};
		for (int row = 0; row < matrix.length; row++){
			for (int column = 0; column < matrix[row].length;column++){
				System.out.print(matrix[row][column] + " | ");
			}
				System.out.println();
				}
				
	
	
	
	}
}