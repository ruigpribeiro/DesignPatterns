package ex04;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        FileManager fileManager = FileManager.getInstance();

        fileManager.setRootDirectory("C:/Users/sw2024/Desktop/Files");

        fileManager.createFile("file.txt");
        fileManager.createFile("FicheiroNovo.txt");

        fileManager.setRootDirectory("/csvFiles");

        fileManager.createFile("tabela.csv");
        fileManager.createFile("filmes.csv");
        fileManager.createFile("jogos.csv");

        fileManager.deleteFile("tabela.csv");
    }
}
