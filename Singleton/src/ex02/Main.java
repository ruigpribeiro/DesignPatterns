package ex02;

public class Main {
    public static void main(String[] args) {

        Logger logFile = Logger.getInstance("application_log.txt");
        logFile.log("Log 1: Variável x definida para 20");
        logFile.log("Log 2: Objeto porsche da Classe Car criado com sucesso");

        Logger myLogger = Logger.getInstance("programa_log.txt");
        myLogger.log("Log 3: Objeto mercedes da Classe Car criado com sucesso");
        myLogger.log("Log 4: Método corrida invocado entre porsche e mercedes");

    }
}
