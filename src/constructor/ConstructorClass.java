//package constructor;
//
//public class ConstructorClass {
//	
//	int x;
//	ConstructorClass() {    //constructor without parameters
//		x=10;
//			
//	}
//
//	public static void main(String[] args) {
//		ConstructorClass obj= new ConstructorClass();
//		System.out.println(obj.x);
//		
//
//	}
//
//}


package constructor;

public class ConstructorClass {
	
	//attributes
	String car;
	int year;
	
	ConstructorClass(String mycar,int yr){ //parameterized constructor// default constructor// 
		//Public,Private ConstructorClass(String mycar,int yr)
		car=mycar;
		year=yr;
		
	}

public static void main(String[] args) {
	
	ConstructorClass obj = new ConstructorClass("nano", 12345);
	System.out.println(obj.car + " " +obj.year);
	
	
}

}






