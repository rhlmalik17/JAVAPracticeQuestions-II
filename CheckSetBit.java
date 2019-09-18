import java.util.*;
public class CheckSetBit
{
    public static Scanner taker = new Scanner(System.in);
    public static boolean checkit(int number,int pos)
    {
        int a = number & (1 << pos-1);
        return (a>0) ? true : false;
    }
    public static void main(String args[])
    {
        int number=taker.nextInt();
        int position = taker.nextInt();
        System.out.println(checkit(number, position));

    }
}