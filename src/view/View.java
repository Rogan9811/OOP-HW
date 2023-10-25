package view;

import java.util.Scanner;

public class View {
    public void consoleMenu()
    {
        System.out.println("1. Sum");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Read Logs");
        System.out.println("6. Выход");
    }

    public String input(){
        System.out.println("Make your choise! :");
        Scanner scanner = new Scanner(System.in);
        return  scanner.nextLine();
    }
}
