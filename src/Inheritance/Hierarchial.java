package Inheritance;

class Parent 

{
	int a;
	void display() {
		System.out.println("Class A:" +a);
	}	
	
}
class child1 extends Parent
{
	int b;
	void print() {
		System.out.println("class B:" +b);
	}
	
}
class child2 extends Parent{
	
	int c;
	void printDetails() {
		System.out.println("class C:" +c);
	}
		
}



public class Hierarchial {
	

	
	public static void main(String[] args) {
		
		child1 obj= new child1();
		obj.a=269;
		obj.b=890;
		
		obj.display();
		obj.print();
		
		child2 obj2= new child2();
		obj2.a=456;
		obj2.c=3435;
		
		
		obj2.display();
		obj2.printDetails();
		

	}
}

