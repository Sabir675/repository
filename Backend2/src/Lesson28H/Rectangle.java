package Lesson28H;

public class Rectangle implements Shape {
	@Override
	public void area(double area) {
		System.out.println("Радиус круга: " + area);
	}
	@Override
	public void perimeter(double primeter) {
		System.out.println("Периметр прямоугольника: " + primeter);
	}
}
