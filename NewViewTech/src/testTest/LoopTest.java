package testTest;

public class LoopTest {

	public static void main(String[] args) {
		LoopTest obj = new LoopTest();
//		obj.myNameIsRasel();
		obj.printMe();
	}
//	public void myNameIsRasel() {
//		for(int i=1; i<=10; i++) {
//			if(i%2==0) {
//			System.out.println("Even Number" +i);
//			}else {
//				System.out.println("Odd Number");
//			}
//		}
//		int hi = 20;
//		int hello = 40;
//		int bye = hi - hello;
//		System.out.println("just print: " + bye);
//	}
	public void printMe() {
		for(int i=1; i<=20; i=i+2){
			
			if(i==9) {
				System.out.println("King Kong");
				break;
			}
			System.out.println(i);
			System.out.println("Testing the new branch");
		}
		System.out.println("I am out side of the loop");
	}


}
