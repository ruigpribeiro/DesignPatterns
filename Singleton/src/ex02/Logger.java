package ex02;

public class Logger {
    public String fileName;
    private static Logger instance;

    private Logger(String fileName) {
        this.fileName = fileName;
    }

    public static Logger getInstance(String fileName) {
        if (instance == null) {
            instance = new Logger(fileName);
        }
        return instance;
    }

    public void log(String message) {
        System.out.println(fileName + ": " + message);
    }
}
