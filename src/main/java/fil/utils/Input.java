package fil.utils;

import java.util.Scanner;


public class Input {


    public static String getString() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print(">");
            if (scanner.hasNextLine()) {
                return scanner.nextLine();
            } else {
                System.out.println("błąd, spróbuj ponownie");
            }
        }
    }
}
