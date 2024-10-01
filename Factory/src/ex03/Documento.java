package ex03;

public abstract class Documento {
    protected String author;
    protected String name;
    protected String extension;

    public Documento(String author, String name) {
        this.author = author;
        this.name = name;
    }

    public abstract void open();
    public abstract void save();
    public abstract void close();
}
