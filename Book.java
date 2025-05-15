
public class Book {
	
	public int bookId;
	public String bookName;
	public String author;
	public boolean isAvailable;
	public Book(int bookId, String bookName, String author) {
		
		this.bookId = bookId;
		this.bookName = bookName;
		this.author = author;
		this.isAvailable = true;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", author=" + author + ", isAvailable="
				+ isAvailable + "]";
	}
	
	
	

}
