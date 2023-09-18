package Inheritance;

class x 
{
	int a;
	void Display() {
	System.out.println("x:" + a);
	
}
	}

class y extends x 
{
	int b;
	void print() {
		System.out.println("y:" + b);
	}

}

class z extends y
{
	int c;
	void printDetails() {
		System.out.println("z:" + c);
	}
	
}


public class Multilevel {

	public static void main(String[] args) {
		z objc = new z();
		objc.a=200;// var initializes
		objc.b=300;
		objc.c=400;
		
		
		objc.Display();//method call
		objc.print();
		objc.printDetails();
		

	}

}
