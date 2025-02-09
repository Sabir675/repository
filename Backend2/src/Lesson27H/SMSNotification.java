package Lesson27H;

public class SMSNotification extends Notification {
	void send(String message) {
		System.out.println("Отправка SMS: " + message);
	} 
}
