package ex04;

public class VintageFilterStrategy implements ImageFilterStrategy {
    @Override
    public void apply(String image) {
        System.out.println("Aplicar filtro vintage na imagem " + image);
    }
}
