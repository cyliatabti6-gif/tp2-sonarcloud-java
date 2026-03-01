import java.security.MessageDigest;

public class AuthService {
    private static final String ADMIN_PASSWORD = "admin123";

    public boolean login(String password) throws Exception {
        return hash(password).equals(hash(ADMIN_PASSWORD));
    }

    private String hash(String input) throws Exception {
        MessageDigest md = MessageDigest.getInstance("MD5");
        return new String(md.digest(input.getBytes()));
    }
}
