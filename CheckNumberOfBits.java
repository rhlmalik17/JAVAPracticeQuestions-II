import java.util.*;
public class CheckNumberOfBits
{
    public static void checkIt(int number)
    {
        int count=0;
       for(int i=0;i<32;i++)
       {
           int temp = number & (1<<i);
           if(temp>0)
           {
               count++;
           }
       }
       System.out.println(count);
       
    }
    public static Scanner taker = new Scanner(System.in);
    public static void main(String args[])
    {
        int number = taker.nextInt();
        checkIt(number);
    }
}