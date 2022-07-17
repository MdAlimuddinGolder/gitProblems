package allMyTest;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<String> obj = new ArrayList<String>();
		
		ArrayList<String> Alim = new ArrayList<String>();
		
		
		obj.add("Alimuddin");
		obj.add("Manha");
		obj.add("Afeia");
		obj.remove(2);
		
		System.out.println(obj);
		
		Alim.add("FirstName");
		Alim.add("LastName");
		Alim.add("Email");
		Alim.add("347222733");
      System.out.println(Alim);
      System.out.println("ArrayList size :" +Alim.size());
      System.out.println("What is the value of Alim :"+ Alim.isEmpty());
      
	}

}
