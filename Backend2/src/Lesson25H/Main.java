package Lesson25H;

public class Main {

	public static void main(String[] args) {
		Person person = new Person();
		Person person2 = new Person("Sabir");
		Person person3 = new Person("Sabir", 12);
		
		person.displayInfo();
		person2.displayInfo();
		person3.displayInfo();
	}

}
