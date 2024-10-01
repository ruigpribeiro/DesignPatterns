package ex03;

import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        UserSessionManager sessionManager = UserSessionManager.getInstance();
        System.out.println("Token de Acesso: " + sessionManager.getSessionToken());
        System.out.println("Último Acesso: " + sessionManager.getLastAccessTime());

        sessionManager.updateLastAccessTime();

        System.out.println("Token de Acesso: " + sessionManager.getSessionToken());
        System.out.println("Último Acesso: " + sessionManager.getLastAccessTime());

    }
}
