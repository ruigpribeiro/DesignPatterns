package ex02;

public class FlatDiscountStrategy implements DiscountStrategy {
    private double discountAmount;

    public FlatDiscountStrategy(double discountAmount) {
        this.discountAmount = discountAmount;
    }

    @Override
    public double applyDiscount(double amount) {
        return amount - discountAmount;
    }
}
