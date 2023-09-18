package method;

public class MethodOverloading {
	
	static void add(int a, int b) {
		System.out.println("1:" + (a+b));
	}
	static void add (double a , double b) {
		System.out.println("2:" + (a+b));
	}
	static void add (int a , double b,int c){
		System.out.println("3:" + (a+b+c));
		
	}
	static void add (int a, int b, int c) {
		System.out.println("4:" + (a+b+c));
	}

	public static void main(String[] args) {
		add(2,4);
		add(3.4,7.8);
		add(5,6.9,90);
		add(78,90,4567);

	}

}
