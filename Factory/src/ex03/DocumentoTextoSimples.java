package ex03;

public class DocumentoTextoSimples extends Documento{

    public DocumentoTextoSimples(String author, String name) {
        super(author, name);
        extension = ".docx";
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
