package Lesson27H;

public abstract class Device {
	abstract void turOn();
	
	void turnOff() {
		System.out.println("Устройство выключено");
	}
}
