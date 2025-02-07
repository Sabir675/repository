package Lesson26H;

import java.util.Objects;

public class Car {
	String brand;
	String model;
	int year;
	
	public Car(String brand, String model, int year) {
		this.brand = brand;
		this.model = model;
		this.year = year;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", model=" + model + ", year=" + year + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(brand, model, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return Objects.equals(brand, other.brand) && Objects.equals(model, other.model) && year == other.year;
	}
}