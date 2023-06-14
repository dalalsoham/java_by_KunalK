public class Reverse {
    /*
    Q: find n = 2 3 5 9 7
    ans: 7 9 5 3 2
    explain:
    7*10+9=79
    79*10+5=795
    795*10+3=7953
    7953*10+2=79532 ----> This is the final ans
     */

    public static void main(String[] args) {
        int num = 23597;
        int ans = 0;

        while(num>0)
        {
            int rem = num%10;
            num = num/10;

            ans = ans * 10 + rem;
        }
        System.out.println(ans);
    }
}
