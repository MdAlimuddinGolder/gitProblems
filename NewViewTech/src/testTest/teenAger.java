package testTest;

public class teenAger {

	int age = 23;

	public static void main(String[] args) {
		teenAger obj = new teenAger();
		obj.hhh();
	}

	public void hhh() {
		if ((age > 0 && age < 13) || (age > 19) || (age == 0)) {
			if (age >= 20 && age <= 25) {
				System.out.println("You are not a teenager but almost act like a teenager");
				if(age==22) {
					System.out.println("Supper star");
				}
			} else {
				System.out.println("You are not a teenager");
			}
		} else {
			System.out.println("You are a teenager");
		}

	}
}
