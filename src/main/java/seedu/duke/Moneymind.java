package seedu.duke;

import java.util.Scanner;

public class Moneymind {

    public static void main(String[] args) {
        MoneymindUI ui = new MoneymindUI();
        ui.printGreeting();
        ui.printNameRequest();

        Scanner in = new Scanner(System.in);
        System.out.println("Hello " + in.nextLine());
    }
}
