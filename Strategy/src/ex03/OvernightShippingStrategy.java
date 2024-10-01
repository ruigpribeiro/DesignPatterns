package ex03;

public class OvernightShippingStrategy implements ShippingStrategy {
    @Override
    public double calculateCost(double weight) {
        return weight * 15;
    }
}
