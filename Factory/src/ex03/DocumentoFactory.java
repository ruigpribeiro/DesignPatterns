package ex03;

public class DocumentoFactory {


    public static Documento createDocumento(String type, String author, String name) {
        switch (type) {
            case "DocumentoTextoSimples":
                return new DocumentoTextoSimples(author, name);
            case "FolhaCalculo":
                return new FolhaCalculo(author, name);
            case "Apresentacao":
                return new Apresentacao(author, name);
            default:
                throw new IllegalArgumentException("Tipo de documento inválido " + type);
        }
    }
}
