package Lesson27H;

public class Main3 {
	public static void main(String[] args) {
		EmailNotification emailNotification = new EmailNotification();
		SMSNotification smsNotification = new SMSNotification();
		emailNotification.send("Hello, World!");
		smsNotification.send("Hello, World!");
	}
}
