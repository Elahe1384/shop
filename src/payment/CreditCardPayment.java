package payment;

public class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;
    private String cardHolderName;

    public CreditCardPayment(String cardNumber, String cardHolderName) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
        System.out.println("Payment Details: " + getPaymentDetails());
    }
    @Override
    public String getPaymentDetails() {
        return "Credit Card - Card Number: " + cardNumber + ", Card Holder: " + cardHolderName;
    }
}