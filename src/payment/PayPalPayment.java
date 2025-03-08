package payment;

public class PayPalPayment implements PaymentStrategy {
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    public void pay(double amount) {
        System.out.println("Paid " + amount + " using PayPal.");
        System.out.println("Payment Details: " + getPaymentDetails());
    }

    public String getPaymentDetails() {
        return "PayPal - Email: " + email;
    }
}