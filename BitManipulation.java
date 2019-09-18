import java.util.*;

/*
    Check if the number is power of 2;
*/

public class BitManipulation
{
    public static boolean checkIt(int number)
    {
        if(number>2)
        {
            int temp=2;
           
            while(temp<=number)
            {
                temp=temp * 2;
                if(temp==number)
                {
                    return true;
                }
            }
        }

        return false;
    }
    public static Scanner taker = new Scanner(System.in);
    public static void main(String args[])
    {
        int number = taker.nextInt();
        System.out.println(checkIt(number));
    }
}