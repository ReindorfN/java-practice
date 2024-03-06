//While statement

class whileloop {
	public static void main(String[] args) {
		int n = 10;
		while(n>0){
			System.out.println("tick " + n);
			n--;
		}
	}
}


class DoWhileLoop {
	public static void main(String[] args) {
		int n = 10;
		do {
			System.out.println("tick " + n);
			n--;
		}
		while(n>0);
	}
}


class sumInteger {
	public static void main(String[] args) {
	int i;
	int sum = 0;
	for (i = 1; i<=10; i++){
		sum += i;
	}
	System.out.println("The sum of numbers from 1 to 11 is :" + sum);
}
}