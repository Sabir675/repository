package Lesson28H;

public class Circle implements Shape {
	@Override
	public void area(double area) {
		System.out.println("Радиус круга: " + area);
	}
	@Override
	public void perimeter(double perimeter) {
		System.out.println("Периметр прямоугольника: " + perimeter);
	}
}
