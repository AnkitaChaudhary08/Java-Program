package nomovies;


import movies.Hollywood;

public class Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car c =new Car();
		c.drive();
		c.brak();
		c.brak();
		
		Hollywood b=new Hollywood();
		b.loginwithmovies();
	};
	
	public void drive() {
		System.out.println("Driver");
		
	}
	public void brak() {
		System.out.println("brak");
		
	}
	public void gear() {
		System.out.println("gera");
	}

}
