package ex02;

public class PercentageDiscountStrategy implements DiscountStrategy {
    private double discountPercentage;

    public PercentageDiscountStrategy(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    @Override
    public double applyDiscount(double amount) {
        return amount - (amount * (discountPercentage / 100));
    }
}
