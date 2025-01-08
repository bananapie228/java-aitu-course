package assigment2;

public class t24 {
    public static void main(String[] args) {
        signIn("user");
        signIn("John");
    }

    public static void signIn(String username) {
        if (username.equals("user")) {
            return; // Abort for unregistered users
        }
        System.out.println("Welcome " + username);
        System.out.println("Missed you very much, " + username);
    }
}
