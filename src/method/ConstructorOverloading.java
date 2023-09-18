package method;

public class ConstructorOverloading {
	
	ConstructorOverloading (int a){
		System.out.println(a);
		
	}
	ConstructorOverloading (double a){
		System.out.println(a);
		
	}
	ConstructorOverloading (double a,int b){
		System.out.println(a);
		System.out.println(b);
		
	}

	public static void main(String[] args) {
		
		ConstructorOverloading obj = new ConstructorOverloading(10);
		ConstructorOverloading obj2 = new ConstructorOverloading(10.78);
		ConstructorOverloading obj3 = new ConstructorOverloading(2.3,5);
		

	}

}
