package Day1;

//
//all classes in java directly or indirectly extents the 
//object class present in java.lang.Object class
// Greetings here is extenting the object class

public class TestGreeting {
	public static void main(String[] args) {
		
		// Greetings( ) by default initialize a constructor
		Greetings grtObj = new Greetings(); 
		
		String res = grtObj.getMessage();
		String res2 = grtObj.getMessage(" SWAGGY");
		System.out.println(res);
		System.out.println(res2);
		
	}
}
 