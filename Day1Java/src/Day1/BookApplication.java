package Day1;


public class BookApplication {
	// headFirstJava
	public static void main(String[] args) {
	Book obj = new Book();
//	System.out.println("Line 1");
//	System.out.println(obj.toString());
//	System.out.println("Line 2");
	// Changing the book number to 102
	
//	obj.bookNumber = 102;	
//	System.out.println(obj.toString());
//	System.out.println("Line 2");
//	
	// Setting and getting book no together:
	int bookNo = obj.getBookNumber();
	System.out.println(bookNo);
	obj.setBookNumber(245);
	
	//changing 
//	int up_bookno = obj.getBookNumber();
//	System.out.println(up_bookno);
//	
	System.out.println(obj.toString());
//	System.out.println(obj);

	
	
	}
}
