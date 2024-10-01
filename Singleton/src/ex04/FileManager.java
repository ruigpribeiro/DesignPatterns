package ex04;

import java.io.File;
import java.io.IOException;

public class FileManager {
    private String fileName;
    private File rootDirectory;
    private static FileManager instance;

    private FileManager(String fileName) {
        this.fileName = fileName;
    }

    public static FileManager getInstance() {
        if (instance == null) {
            instance = new FileManager("file");
        }
        return instance;
    }

    // Criar um ficheiro
    public void createFile(String fileName) throws IOException {
        File myFile = new File(rootDirectory, fileName);
        if (myFile.createNewFile()) {
            System.out.println("File created: " + myFile.getAbsolutePath());
        } else {
            System.out.println("File already exists: " + myFile.getAbsolutePath());
        }
    }

    // Apagar um ficheiro
    public void deleteFile(String fileName) throws IOException {
        File myFile = new File(rootDirectory, fileName);
        if (myFile.delete()) {
            System.out.println("File deleted: " + myFile.getAbsolutePath());
        } else {
            System.out.println("File could not be deleted: " + myFile.getAbsolutePath());
        }
    }

    // Criar um diretório
    public void setRootDirectory(String path) {
        File directory = new File(path);
        if (!directory.exists()) {
            directory.mkdirs();
        }
        this.rootDirectory = directory;
    }
}
