public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        String name = "Soham";
        {
//          int  a = 78; // already initialised outside the block in the same method, hence you cannot initialised again
            a = 100; //reassign the origin ref variable to some other value
            System.out.println(a);
            int c = 99;
            name = "Rahul";
            System.out.println(name);
            //valur initialised in this block , will remain in block
        }
//        System.out.println(c);  // cannot use outside the block
        System.out.println(a);
        System.out.println(name);

//        System.out.println(marks); //this marks not use here .... if we use it shows me wrong
    }

    static void random(int marks)
    {
        int num = 67;
        System.out.println(num);
        System.out.println(marks); // you can access this markes into only this function not use another function
    }
}
