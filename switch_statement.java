// Switch statement example
class SampleSwitch {
	public static void main(String args[]){
		for(int i=0; i<4; i++)
			switch(i){
				case 0:
				System.out.println("i is Zero");
				break;
				case 1:
				System.out.println("i is one");
				break;
				case 2:
				System.out.println("i is two");
				break;
				default:
				System.out.println("i is greater than 2");
			}
	}
}

// Random number generation

class RandGen{
	public static void main(String[] args){
		double j = Math.random();
		System.out.println(j);
		double i = Math.random()*10;
		System.out.println(i);
	}
}

