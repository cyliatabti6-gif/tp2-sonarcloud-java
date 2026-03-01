public class App {
    public static void main(String[] args) {
        DatabaseService db = new DatabaseService();
        db.getUser("1 OR 1=1");

        AuthService auth = new AuthService();
        try {
            auth.login("admin123");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
