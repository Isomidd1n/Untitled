import controller.AdminController;
import controller.UserController;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AdminController adminController = new AdminController();
        UserController userController = new UserController();
        System.out.print("Parol kiriting:");
        int n = scanner.nextInt();

        if (n == 33333) {
            adminController.showMenu();
        }
        if (n == 1111) {
            userController.showMenu();
        }
    }
}
