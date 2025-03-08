package payment;

public class BitcoinPayment implements PaymentStrategy {
    private String walletAddress;

    // Constructor
    public BitcoinPayment(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Bitcoin.");
        System.out.println("Payment Details: " + getPaymentDetails());
    }

    public String getPaymentDetails() {
        return "Bitcoin - Wallet Address: " + walletAddress;
    }
}
