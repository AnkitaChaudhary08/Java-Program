package Inheritance;

class A 
{
	int a;
	void display(){
		System.out.println("Class A:" +a);
		
	}
}

class B extends A
{
	int b;
	void print() {
		System.out.println("Class B:" +b);
	}
}
	


public class SingleLevel {

	public static void main(String[] args) {
		
		A objA = new A();
		objA.a=20;
		objA.display();
		B objB = new B();
		objB.a=45;
		objB.b=50;
		objB.display();
		objB.print();
		

	}

}
