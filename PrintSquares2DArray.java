import java.util.*;

public class PrintSquares2DArray
{
    public static Scanner taker = new Scanner(System.in);
    public static void printIt(int input)
    {
        int index=0;
        int top=0;
        int right= (input*2)-2;
        int bottom=(input*2)-2;
        int left=0;
        /*DECLARE THE ARRAY*/
        int arr[][]=new int[(input+input-1)][(input+input-1)];

        /*SET THE CENTER*/
        arr[input-1][input-1]=1;


        while(input>1)
        {
            for(int i=index;i<=right;i++)
            {
                arr[index][i]=input;
            }
            index=right;
            for(int i=top+1;i<=bottom;i++)
            {
                arr[i][index]=input;
            }
            for(int i=index-1;i>=left;--i)
            {
                arr[index][i]=input;
            }
            index=top;
            for(int i=bottom-1;i>=index+1;--i)
            {
                arr[i][index]=input;
            }
            input--;
            top++;
            right--;
            bottom--;
            left++;
           index++;
        }
        display(arr);
    }
    public static void display(int arr[][])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.print(arr[i][j]+" "); 
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        System.out.print("Enter input: ");
        printIt(taker.nextInt());
    }
}