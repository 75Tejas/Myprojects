import java.util.HashMap;

public class Library {

	public static void main(String[] args) {
		
		
		//System.out.println("1. create user");
		//System.out.println("2. create book ");
		//System.out.println("3. borrow book");
//		System.out.println("4. return book ");
		//System.out.println("5. List book");
		
		
		
		//User[] users = new User[10];
		HashMap<Integer,User> users = new HashMap<>();
		
		users.put(1,new User(1, "Tejas"));
		users.put(2,new User(2, "Yash"));
		
		HashMap<Integer,Book> books = new HashMap<>();
		
		books.put(1,new Book(1, "AIWL", "CC"));
		books.put(2,new Book(2, "War", "UV"));
		books.put(3,new Book(3, "Cars", "Shubh"));
		
		//borrow Book functionality (Check) 	
		int userId = 1;
		User currUser = users.get(userId);
		int bookId = 2;
		Book currbook = books.get(bookId);
		
		currUser.BorrowBook(currbook);
		
		
		
		//listbooks
		
		users.get(1).ListBook();
		
		
		
		
		

	}

}
