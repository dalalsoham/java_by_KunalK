import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
//        String message = greet();
//        System.out.println(message);

        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String naam = in.next();
        String personalised = mygreet(naam);
        System.out.println(personalised);
    }

    static String mygreet(String name) {
        String message = "Hello " + name;
        return message;
    }

    static String greet()
    {
        String greeting = "how r u?";
        return greeting;
    }
}
