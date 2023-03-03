package seedu.duke;

public class MoneymindUI {
    private static final String LINE = "____________________________________________________________\n";
    private static final String LOGO =
            ".-.   .-. .----. .-. .-..----..-.  .-..-.   .-..-..-. .-..----. \n" +
                    "|  `.'  |/  {}  \\|  `| || {_   \\ \\/ / |  `.'  || ||  `| || {}  \\\n" +
                    "| |\\ /| |\\      /| |\\  || {__   }  {  | |\\ /| || || |\\  ||     /\n" +
                    "`-' ` `-' `----' `-' `-'`----'  `--'  `-' ` `-'`-'`-' `-'`----' \n";
    private static final String GREETING = "Hello from\n" + LOGO + "What may I help you?";
    private static final String NAME_REQUEST = "What is your name?";
    private static final String GOODBYE = "Bye. Hope to see you again soon!";
    private static final String ERROR = "☹ OOPS!!! I'm sorry, but I don't know what that means :-(";
    private static final String LIST = "Here are the events in your list:";

    public MoneymindUI() {
    }

    public static void printGreeting() {
        System.out.println(LINE + GREETING + System.lineSeparator() + LINE);
    }

    public static void printGoodbye() {
        System.out.println(GOODBYE);
    }

    public static void printNameRequest() {
        System.out.println(NAME_REQUEST);
    }

    public static void printError() {
        System.out.println(ERROR);
    }
}