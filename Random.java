import java.util.*;
public class Random
{
    public static Scanner taker = new Scanner(System.in);
    public static void main(String args[])
    {
        String a = taker.nextLine();
        StringBuffer b = new StringBuffer(a);
        System.out.println(checkIfPalindrom(b)); 
    }
    public static boolean checkIfPalindrom(StringBuffer a)
    {
        // StringBuffer temp = new StringBuffer(a.toString());
        return (a.toString().equals(a.reverse().toString())) ? true : false;
        
    }
}