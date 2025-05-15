import java.util.ArrayList;

public class User {
	
	public int userId;
	public String name;
	public ArrayList<Book> borrowedBooks;
	
	
	public User(int userId, String name) {
		
		this.userId = userId;
		this.name = name;
		this.borrowedBooks =new ArrayList<>();
	}
	
	public void BorrowBook(Book book){
		
		if(book.isAvailable) {
			this.borrowedBooks.add(book);
			book.isAvailable=false;
		}
		else {
			System.out.println("Book not Available");
		}
	}
    public void ReturnBook(Book book){
    	
    	if(borrowedBooks.contains(book)) {
    		this.borrowedBooks.remove(book);
    		
    		book.isAvailable=true;
    	}
    	else {
    		System.out.println("Book was not borrowed by this User.");
    	}
    	
		
	}
	
	public void ListBook() {
		
		System.out.println(this);
		System.out.println(this.userId);
		System.out.println(this.name);
		
		if(borrowedBooks.isEmpty()) {
			System.out.println("No book borrowed");
		}
		
		for(Book book: borrowedBooks) {
			System.out.println(book);
		}
		
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", borrowedBooks=" + borrowedBooks + "]";
	}

	
	
	
	
	

}
