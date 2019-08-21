package greens;

import tech.SeleniumDetails;

public class JavaDetails extends SeleniumDetails {

	public void javaSyllabus() {
		System.out.println("OOPS");
		System.out.println("a is a");

	}

	public void java() {
		int a = 22;
		int b = 87;
		System.out.println(a * b);
		System.out.println("hai");
		System.out.println(a + b);
	}

	public static void main(String[] args) {
		JavaDetails c = new JavaDetails();
		c.javaSyllabus();
		c.java();

	}
	
}
