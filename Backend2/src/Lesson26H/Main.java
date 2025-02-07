package Lesson26H;

public class Main {
	public static void main(String[] args) {
		Book book = new Book("Java", "Sabir", 1982);
		Book book2 = new Book("Java", "Sabir", 1982);
		System.out.println(book.toString());
		System.out.println(book2.toString());
		System.out.println(book.equals(book2));
	}
}
