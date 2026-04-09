import java.util.Scanner;
// Dummy commit 3 // Dummy commit 4
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Login login = new Login();

        System.out.println("=== Registration ===");

        System.out.print("Enter username: ");
        String username = input.nextLine();

        System.out.print("Enter password: ");
        String password = input.nextLine();

        System.out.print("Enter phone number (+27): ");
        String phone = input.nextLine();

        String message = login.registerUser(username, password, phone);
        System.out.println(message);

        System.out.println("\n=== Login ===");

        System.out.print("Enter username: ");
        String user = input.nextLine();

        System.out.print("Enter password: ");
        String pass = input.nextLine();

        boolean status = login.loginUser(user, pass);
        System.out.println(login.returnLoginStatus(status));
    }
}
// first commit test