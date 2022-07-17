package allMyTest;

public class ArrayTest {

	public static void main(String[] args) {
		String [] name = new String [4];
		name [0] = "Manha";
		name [1] = "Afeia";
		name [2] = "Alimuddin";
		name [3] = "Abir";	
		
		String [] Student = {"Salam", "Korim","Rohim"};
		
		String[] [] Age = {{"Jony", "Rony", "Sumon"},
		                 {"Altaf", "Latif", "Alim"},
	                 	{"Kobir","Rashad","Emon"}};
		System.out.println(Age[2][1]);
		for(int x=0; x<Age.length; x++) {
			for(int y=0; y<Age.length; y++) {
				System.out.println(Age[x][y]);
			}
				
		}
				
		
      System.out.println( name[0]);
      
   for (int i=0; i<name.length;i++) {
   System.out.println(name[i]);
	   
  }
    	  
   System.out.println(Student[0]); 	  
    
   System.out.println(Student[1] + " "+Student[2]);

      

	
	}
}
