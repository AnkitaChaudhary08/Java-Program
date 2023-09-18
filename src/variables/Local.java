package variables;

public class Local {
	int age=250; //global variables- scope of the outer method

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Local l = new Local();
		l.test();
		l.test2();

	}

	public void test() {
		//int age=25;// local variables-scope only within method don't access outside the another method
		System.out.println(age);
	}
	
	public void test2() {
		System.out.println(age);
	}
}
