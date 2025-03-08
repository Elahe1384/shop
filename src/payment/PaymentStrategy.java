package payment;

public interface PaymentStrategy {
    public interface paymentStrategy {

        void pay(double amount);

        String getPaymentDetails();
    }
}
