package allMyTest;

import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) {
		
		HashMap<Integer,String>  obj = new HashMap<Integer,String>();
		HashMap<Integer,Integer>  jjj = new HashMap<Integer,Integer>();
		HashMap<String,String>  zzz = new HashMap<String,String>();
		
		obj.put(10, "Alimuddin");
		jjj.put(15, 100);
		zzz.put("Manha", "She is my Ammu");
		
		System.out.println("My HashMap Value " +obj);
		System.out.println("My HashMap Value " +jjj);
		System.out.println("My HashMap Value " +zzz);
		


	}

}
