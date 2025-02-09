package Lesson27H;

public class PayPalPayment extends Payment {
	void pay(double amount) {
		System.out.println("Оплата через PayPal на сумму " + amount);
	}
}
