package Lesson26H;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car("Bmw", "M5", 2020);
		Car car2 = new Car("Audi", "rs7", 2024);
		
		Car[] cars = {car, car2};
		for (Car car3 : cars) {
			System.out.println(car3.toString());
		}
	}

}
