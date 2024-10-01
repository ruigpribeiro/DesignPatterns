package ex02;

public class PaymentProcessor {
    private DiscountStrategy discountStrategy;

    public PaymentProcessor(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public double calculateTotal(double amount) {
        return discountStrategy.applyDiscount(amount);
    }
}
