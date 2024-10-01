package ex01;

public class Main {
    public static void main(String[] args) {

        Product book = ProductFactory.createProduct("book");
        Product electronics = ProductFactory.createProduct("electronics");
        Product clothign = ProductFactory.createProduct("clothing");

        book.display();
        electronics.display();
        clothign.display();
    }
}