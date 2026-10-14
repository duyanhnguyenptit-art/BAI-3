public class Main {
    public static void main(String[] args) {
        Payment[] payments = {
            new CashPayment(500000),
            new CardPayment(1200000)
        };

        for (Payment p : payments) {
            p.showAmount();
            p.processPayment();
        }

        if (payments[1] instanceof CardPayment) {
            ((CardPayment) payments[1]).refund();
        }
    }
}