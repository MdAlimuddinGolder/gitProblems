package testTest;

public class ifElseTest {
	int age = 100;

	public static void main(String[] args) {
		ifElseTest obj = new ifElseTest();
		obj.myFirstTest();
	}

	public void myFirstTest() {
		if (age < 18) {
			System.out.println("This person is not a voter");
		} else if (age >= 18 && age < 50) {
			System.out.println("You are a voter");
		} else if (age >= 50 && age < 80) {
			System.out.println("You are a  senior voter");
		} else if (age >= 80 && age <= 100) {
			System.out.println("You are a special voter");
		} else if (age >= 101) {
			System.out.println("Talk to customer service");
		} else {
			System.out.println("Wrong input");
		}
	}

}
