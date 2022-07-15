package testTest;

public class ChildClass extends ParentClass {
    int j = 30;
    int k = 20;
    int A = 100; 
    int B;
    
    
	public static void main(String[] args) {
		ChildClass obj = new ChildClass();
		obj.justTest();
		obj.firstMethod();
		obj.secondMethod();
		obj.hhh();
		obj.lll(20);
	}
	
	public void justTest() {
	int l = j-k;
	System.out.println("I am in the child class" +l);
	}
	
	public void hhh() {
		int u = super.A+k;
		int p = A+k;
		System.out.println("Just print "+ u);
		System.out.println("Just print "+ p);
	}
	
	public void lll(int B) {	
		int S = A+B;
		System.out.println("Print B "+S);
	}
	public void firstMethod() {
		System.out.println("I am SuperMethod");
		super.firstMethod();
	}

}
