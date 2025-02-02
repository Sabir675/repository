package Lesson25H;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car("Merecedes", "S-580", 1985);
		car.displayInfo();
		
		car.setBrand("BMW");
		car.setModel("M5");
		car.setYear(2004);
		
		car.displayInfo();
		
	}

}
