package ex02;

public class TacoFactory {

    public static Taco createTaco(String type) {
        switch (type) {
            case "TacoCarneVaca":
                return new TacoCarneVaca();
            case "TacoCarneFrango":
                return new TacoCarneFrango();
            case "TacoVegetariano":
                return new TacoVegetariano();
            default:
                throw new IllegalArgumentException("Tipo de taco inválido " + type);
        }
    }
}
