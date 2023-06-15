import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        int empId = in.nextInt();
//        String department = in.next();
//
//        switch (empId)
//        {
//            case 1:
//                System.out.println("Soham Dalal");
//                break;
//            case 2:
//                System.out.println("Soham Sina");
//                break;
//
//            case 3:
//                System.out.println("emp number 3");
//                switch (department)
//                {
//                    case "ECE":
//                        System.out.println("ECE department");
//                        break;
//                    case "Management":
//                        System.out.println("MBA department");
//                        break;
//                    default:
//                        System.out.println("No department");
//                }
//                break;
//            default:
//                System.out.println("Enter correct empId");
//        }

        //enhanced switch :
        int empId = in.nextInt();
        String department = in.next();

        switch (empId) {
            case 1 -> System.out.println("Soham Dalal");
            case 2 -> System.out.println("Soham Sina");
            case 3 -> {
                System.out.println("emp number 3");
                switch (department) {
                    case "ECE" -> System.out.println("ECE department");
                    case "Management" -> System.out.println("MBA department");
                    default -> System.out.println("No department");
                }
            }
            default -> System.out.println("Enter correct empId");
        }
    }
}
