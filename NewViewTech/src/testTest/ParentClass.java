package testTest;

public class ParentClass {
	int A = 10;
	int B = 20;

	public void firstMethod() {
		int c = A + B;
		System.out.println("I am in the Parent Class: " +c);
	}
	public void secondMethod() {
		int c = A - B;
		System.out.println("I am in the Parent Class 2nd method : " +c);
	}

}
