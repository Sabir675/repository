package Lesson27H;

public class Main2 {
	public static void main(String[] args) {
		CreditCardPayment creditCardPayment = new CreditCardPayment();
		PayPalPayment payPalPayment = new PayPalPayment();
		creditCardPayment.pay(50);
		payPalPayment.pay(100);
	}
}
