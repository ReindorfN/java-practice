
class newArray {
	public static void main(String[] args){
		int[][] array1 = new int[3][]; //Declaration
		
		array1[0] = new int[3]; array1[1] = new int[4]; array1[2] = new int[2];//2d size allocation
		
		array1[0][0] = 24; array1[0][1] = 43; array1[1][3] = 756; array1[2][0] = 43;
		for(int i = 0; i < array1.length; i++){
			for(int j = 0; j< array1[i].length; j++){
			System.out.print(array1[i][j] + " | ");}
		System.out.println();}
	}
}