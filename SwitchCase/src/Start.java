import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        String a = "Soham";
//        String b = "Soham";
//        System.out.println(a == b); // it will shows that TRUE becoz the above string shows the same value same things, so this o/p is TRUE . if i add another string name then it shows me FALSE

//        String fruit = in.next();

//        switch(fruit)
//        {
//            case "Mango":
//                System.out.println("king of fruit");
//                break;
//            case "Apple":
//                System.out.println("A sweet red fruit");
//                break;
//            case "Orange":
//                System.out.println("Round fruit");
//                break;
//            case "Grapes":
//                System.out.println("small fruit");
//                break;
//            default:
//                System.out.println("Plz enter a valid input");
//        }

        //enhanced switch statement : (new thing)
//        switch (fruit) {
//            case "Mango" -> System.out.println("king of fruit");
//            case "Apple" -> System.out.println("A sweet red fruit");
//            case "Orange" -> System.out.println("Round fruit");
//            case "Grapes" -> System.out.println("small fruit");
//            default -> System.out.println("Plz enter a valid input");


//        int day = in.nextInt();
//        switch (day)
//        {
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//        }


        //another method of switch case:
//        int day = in.nextInt();
//        switch (day)
//        {
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("weekday");
//                break;
//            case 6:
//            case 7:
//                System.out.println("weekend");
//                break;
//        }

        //enhanced switch :
        int day = in.nextInt();
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("weekday");
            case 6, 7 -> System.out.println("weekend");
        }


    }
}
