import java.util.ArrayList;
import java.util.List;

public class Main1 {

	String title;

	public Main1(String title) {

		this.title = title;
	}

}

class library {

	private List<Main1> books;

	library() {
		books = new ArrayList<Main1>();

	}

	void addBook(Main1 book) {
		addBook(book);
	}

	void showBook() {
		for (Main1 book : books) {
			System.out.println(book.title);
		}
	}
}

