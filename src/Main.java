import payment.BitcoinPayment;
import payment.CreditCardPayment;
import payment.PayPalPayment;
import payment.RegularCustomer;

public class Main {
    public static void main(String[] args) {
        RegularCustomer customer1 = new RegularCustomer("elahe");
        RegularCustomer customer2 = new RegularCustomer("asiye");
        RegularCustomer customer3 = new RegularCustomer("asal");

        CreditCardPayment one = new CreditCardPayment("123" , "elahe");
        PayPalPayment two = new PayPalPayment("Asiye@gmail.com");
        BitcoinPayment three = new BitcoinPayment("google");

        customer1.displayCustomerInfo();
        customer2.displayCustomerInfo();
        customer3.displayCustomerInfo();

        customer1.makePayment(one , 200);
        customer2.makePayment(two, 300);
        customer3.makePayment(three, 400);

        customer1.makePayment(one, 500);
        customer2.makePayment(two, 600);
        customer3.makePayment(three, 700);

        customer1.showPaymentHistory();
        customer2.showPaymentHistory();
        customer3.showPaymentHistory();


    }
}