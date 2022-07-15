package testTest;

public class SampleTest {

	int hhh = 12 + 5;
	int abc = 6;
	int jjj = 40;
	String Rasel = "sample test to print";
	static int t = 20;

	public SampleTest() {
		System.out.println("I am here");
	}

	public SampleTest(int a, int b) {
		System.out.println("I am here");
	}

	public static void main(String[] args) {
		SampleTest Zahid = new SampleTest();
		SampleTest Zahid1 = new SampleTest(20, 40);
		Zahid.light();
		Zahid.addition();
		Zahid.localVariable();
		Zahid.paramiter(80, 60);
		SampleTest.rrr();
		String MN = Zahid.myName();
		System.out.println(MN);
		Zahid.funMethoid();
		
	}

	public void light() {
		int f = hhh + jjj;
		int o = jjj - abc;
		System.out.println("We are trying to see a text: " + f);
		System.out.println("We are trying to see a valu: " + o);
	}

	private void addition() {
		int k = abc + jjj;
		System.out.println("just print k: " + k);
		System.out.println(Rasel);
	}

	public void localVariable() {
		int hi = 20;
		int hello = 40;
		int bye = hi - hello;
		int kk = abc + jjj;
		System.out.println("just print: " + bye);
		System.out.println("just print: " + kk);
	}

	public void paramiter(int a, int b) {
		int c = a + b;
		System.out.println("King Kong: " + c);
	}

	public static void rrr() {
		int y = 40;
		int u = t + y;
		System.out.println("just chil:" + u);
	}

	public String myName() {
		String name = "Md Nahidul Islam";
		return name;
	}

	
	
	public int funMethoid() {
		int g = abc + jjj;
		System.out.println("printing return type method: "+g);
		return g;		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
