package ex03;

public class Apresentacao extends Documento {

    public Apresentacao(String author, String name) {
        super(author, name);
        extension = ".pptx";
    }

    @Override
    public void open() {
        System.out.println("A abrir o documento de " + getClass().getSimpleName() + " " + name + extension);
    }

    @Override
    public void save() {
        System.out.println("Alterações do " + author + " gravadas.");
    }

    @Override
    public void close() {
        System.out.println("A fechar o documento de " + getClass().getSimpleName());
    }
}
