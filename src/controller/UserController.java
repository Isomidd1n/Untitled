package controller;

import java.util.Scanner;

public class UserController {

   private final Scanner scanner = new Scanner(System.in);

    public void showMenu(){

        while (true ){
            System.out.println("****** Menu ******");
            System.out.println("1> 1 ni ishlatish");
            System.out.println("2> 2 ni ishlatish");
            System.out.println("3> 3 ni ishlatish");
            System.out.println("4> 4 ni ishlatish");
            System.out.println("0> 0 tugatish.");
            int num = scanner.nextInt();
            switch (num){
                case 1:
                    System.out.println("1.Ishladi");
                    break;
                case 2:
                    System.out.println("2.Ishladi");
                    break;
                case 3:
                    System.out.println("3.Ishladi");
                    break;
                case 4:
                    System.out.println("4.Ishladi");
                    break;
                case 5:
                    System.out.println("5.Ishladi");
                    break;
                case 6:
                    System.out.println("6.Ishladi");
                    break;
                    case 0:
                    System.out.println("0.Tugadi.");
                    break;
                default:
                    System.out.println("Error !!!");
                    break;
            }
            return;
        }
    }
}
