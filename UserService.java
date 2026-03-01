public class UserService {
    public void printRole(String role) {
        if (role.equals("ADMIN")) {
            System.out.println("Admin access");
        } else {
            System.out.println("User access");
        }
    }

    public void printRoleDuplicate(String role) {
        if (role.equals("ADMIN")) {
            System.out.println("Admin access");
        } else {
            System.out.println("User access");
        }
    }
}
