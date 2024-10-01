package ex03;

public class StandardShippingStrategy implements ShippingStrategy {
    @Override
    public double calculateCost(double weight) {
        return weight * 5;
    }
}
