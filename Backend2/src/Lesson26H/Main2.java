package Lesson26H;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person("Sabir", 12, "Baku");
		Person person2 = new Person("Sabir", 12, "Qabala");
		System.out.println(person.toString());
		System.out.println(person2.toString());
		System.out.println(person.equals(person2));
	}

}
