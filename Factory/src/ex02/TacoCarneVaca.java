package ex02;

public class TacoCarneVaca implements Taco {
    private String type = "taco de carne de vaca.";

    @Override
    public void prepare() {
        System.out.println("A preparar " + type);
    }

    @Override
    public void bake() {
        System.out.println("A cozinhar " + type);
    }

    @Override
    public void box() {
        System.out.println("A embalar " + type);
    }
}
