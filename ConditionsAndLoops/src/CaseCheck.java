import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        String word = "hello";
//        System.out.println(word.charAt(1)); //charAt use to print a string word link "hello" this is a string so 0= h , 1 = e .... and so on this charAt use for it .

        //.trim() is use to remove the all extra space btwn the word or string.
        char ch = in.next().trim().charAt(0);

        if(ch >= 'a' && ch <= 'z')
        {
            System.out.println("Lowercase");
        }
        else
        {
            System.out.println("Uppercase");
        }
    }
}
