import java.util.*;

public class BitAnd
{
    public static Scanner taker = new Scanner(System.in);
    public static boolean checkIt(int n)
    {
        int a = n & n-1;
        if(a==0)
        return true;
        else
        return false;
    }
    public static void main(String args[])
    {
        int number = taker.nextInt();
        System.out.println(checkIt(number));
    }
} 