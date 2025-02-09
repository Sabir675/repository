package Lesson27H;

public class EmailNotification extends Notification {
	void send(String message) {
		System.out.println("Отправка Email: " +  message);
	}
}
