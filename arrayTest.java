
public class ArrayTest {
	public static void main(String[] a) {
		//double[] d = new double[5];
		//d[0] = 10; d[1] = 15; d[2] = 20; d[3] = 25; d[4] = 30;
		
		//Create an array and initialize it at the same time.
		double[] d = {10, 15, 20, 25, 30};
		double sum = 0;
		for (int i=0; i<5; i++){
			sum = sum+d[i];
		}
		double average = sum/d.length;
		System.out.printf("The average of the numbers is: %5.2f%n.", average);
		System.out.println("The numbers greater than the average are: ");
		for (int i=0; i<5; i++){
			if(d[i] > average){
				System.out.println(d[i] + "");
			}
		}
	}
}