package method;

public class StaticMethod {
	
	//syntax- access modifier return type name of method (parameter list)
	//--
//---method body
	
	//types of method-
//	1-static method->if a static method then we don't need to create an object of the class
	
	//2-non-static method->if the non-static method then we need to create an object of the class and call it
	
//	static void printdetails() {//static method
//		System.out.println("Hello Java World");
//	}
	
	
//	public void message() {//non static method
//		System.out.println("hello selenium with java");
//	}
	
	
	public void sum(int a, int b) {  //parameter list
		System.out.println("sum of a & b "  + (a+b));
		
	}
	
	public static void main(String[] args) {
		//printdetails(); //call the method(static)
		StaticMethod st=new StaticMethod();
//		st.message();//non static call
		
		st.sum(2,3);//arguments
	}

}
