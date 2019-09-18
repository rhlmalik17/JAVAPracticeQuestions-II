import java.util.*;

public class ChocolateDivisionBar
{
    public static void division(int arr[],int m,int d)
    {
        if(m<=arr.length){ 
        int s=0,e=m-1;
        int sum=0,count=0;
        do
        {
            sum=0;
            for(int i=s;i<=e;i++)
            {
                sum+=arr[i];
            }
            if(sum==d)
            {
                count++;
            }
            s++;
            e++;
        }while(e!=arr.length);
        System.out.print("Total number of Chocolate Divsions: "+count);
    }
    }
    public static Scanner taker = new Scanner(System.in);
    public static void main(String args[])
    {
        int n=taker.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=taker.nextInt();
        }
        int d=taker.nextInt();
        int m=taker.nextInt();
        division(arr, m, d);

    }
}