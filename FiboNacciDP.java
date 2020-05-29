import java.util.Scanner;

public class FiboNacciDP{
    int arr[];
    public static Scanner taker = new Scanner(System.in);
    public int fib(int n,int index)
    {
       if(n==0 || index>=arr.length)
       {
           display(arr);
           return n;
       }

       int result = fib(n-2, index+1) + fib(n-1,index+1);
       if(result==arr[index])
       return n;
       else{
           arr[index]=result;
       }

       return result;
    }
    public void display(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        FiboNacciDP obj = new FiboNacciDP();
        int n=taker.nextInt();
        obj.arr=new int[n];
        System.out.println(obj.fib(n-2, 2));

    }
}