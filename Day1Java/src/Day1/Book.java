package Day1;

public class Book {
	// Attribute decleration
	int bookNumber = 123; 
	private String bookName = "Hari Puttar"; 
	private String author = "JK rolling"; 
	private double price = 20;
	
	public int getBookNumber() {
		return bookNumber;
	}
	public void setBookNumber(int bookNumber) {
		if (bookNumber<=0) System.out.println("ERROR IT SHOULD BE POSITIVE");
		else this.bookNumber = bookNumber;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Book [bookNumber=" + bookNumber + ", bookName=" + bookName + ", author=" + author + ", price=" + price
				+ ", getBookNumber()=" + getBookNumber() + ", getBookName()=" + getBookName() + ", getAuthor()="
				+ getAuthor() + ", getPrice()=" + getPrice() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
//	public String toString() {
//		// this is a current calling object
//		return this.bookNumber+", "+this.bookName+", "+this.price+", "+ author;
//	}
	


}
