package allMyTest;

public class NormalTest {
	int xy = 5;
	int yz = 10;
	int zx = 15;
	int p = 7;
	int q = 13;
	String  name = " I am student of IT class";
			

	public static void main(String[] args) {
		NormalTest obj = new NormalTest();
		obj.Employee();
		obj.addition();
		obj.localVariable();
		obj.paramiter(20, 30);

	}
	public void Employee() {
		int A = xy + yz;
		int B = zx - xy;
		System.out.println( "I want to see addition " +A);
		System.out.println("Just Print out Subtraction " +B);
		System.out.println(name);
		
	}
	public void addition() {
		int AB = p + q;
		int AC = xy + p;
		System.out.println(" Pirnt out The Value of AB  " +AB);
		System.out.println(" Show me the value of AC  " +AC);
	}
	public void localVariable() {
		int V = 12;
		int W = 8;
		int X = V+W;
		String light = " What is your name";
		System.out.println(+X);
		System.out.println("What is light " +light);
	}
	public void paramiter ( int a, int b) {
		
	int C = a + b;
	System.out.println(" Print out Paramiter " +C);
	}
}
