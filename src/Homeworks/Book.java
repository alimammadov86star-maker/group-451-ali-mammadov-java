package Homeworks;

public class Book {
	String title;
	String author;
	int year;
	int copies;

	Book(String title, String author, int year, int copies) {
		this.title = title;
		this.author = author;
		this.year = year;
		this.copies = copies;
	}

	void giveBook() {
		if (copies > 0) {
			copies--;
		}
	}
}