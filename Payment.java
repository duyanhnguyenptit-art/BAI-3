interface Refundable {
    void refund();
}

abstract class Payment {
    protected double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    public abstract void processPayment();

    public void showAmount() {
        System.out.println("So tien: " + (long) amount);
    }
}

class CashPayment extends Payment {
    public CashPayment(double amount) {
        super(amount);
    }

    @Override
    public void processPayment() {
        System.out.println("Thanh toan bang tien mat");
    }
}

class CardPayment extends Payment implements Refundable {
    public CardPayment(double amount) {
        super(amount);
    }

    @Override
    public void processPayment() {
        System.out.println("Thanh toan bang the");
    }

    @Override
    public void refund() {
        System.out.println("Hoan tien thanh cong qua the");
    }
}

