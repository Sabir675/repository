package Lesson26H;

public class Car {
	String brand;
	String model;
	int year;
	public Car(String brand, String model, int year) {
		this.brand = brand;
		this.model = model;
		this.year = year;
	}
	
	public String displayInfo() {
		return "brand: " + brand + " model: " + model + " year: " + year;
	}
	
	
}
