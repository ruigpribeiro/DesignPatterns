package ex03;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;

public class UserSessionManager {
    private static UserSessionManager instance;
    private int sessionToken;
    private String lastAccess;

    private UserSessionManager() {
        sessionToken = (int) (Math.random() * 1000);
        updateLastAccessTime();
    }

    public static UserSessionManager getInstance() {
        if (instance == null) {
            instance = new UserSessionManager();
        }
        return instance;
    }

    public void updateLastAccessTime() {
        lastAccess = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss").format(new Date());
    }

    public int getSessionToken() {
        return sessionToken;
    }

    public String getLastAccessTime() {
        return lastAccess;
    }
}
