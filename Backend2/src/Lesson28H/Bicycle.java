package Lesson28H;

public class Bicycle implements Vehicle{
	@Override
	public void start() {
		System.out.println("Велосипед в движении");
	}
	
	@Override
	public void stop() {
		System.out.println("Велосипед останавилось");
	}
}
