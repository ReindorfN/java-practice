
//Program that diplays the first 100 pentagonal numbers
public class PentagonalNumbers {
	public static void main(String[] args) {
		System.out.println("These are the first 100 pentagonal numbers :");
		int pentNum;
		int count = 0;
		for (int i=1; i<100; i++){
			count++;
			pentNum = getPentagonalNumber(i);
			System.out.printf("%7d",pentNum);
			if(count %10 == 0){
				System.out.println("");
			}
		}
	}
	
	public static int getPentagonalNumber(int n) {
		int num = n*(3*n-1)/2;
		return num;
	}
}