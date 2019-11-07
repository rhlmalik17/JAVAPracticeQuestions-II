import java.util.Stack;
public class LargestContigiousSubArrayWithSumZero
{
    public static void printLargestNum(int arr[])
    {
       int sums[]=new int[arr.length];
       int sum=arr[0];
       sums[0]=sum;
       for(int i=1;i<arr.length;i++)
       {
           sum+=arr[i];
           sums[i]=sum;
       }
    
       for(int i=0;i<arr.length;i++)
       {
           for(int j=arr.length-1;j>=(i+1);--j)
           {
                if(sums[j]==sums[i])
                {
                    System.out.println("Max Subarray: "+(j-i));
                    System.exit(0);
                }
           }
       }
       
    }
    // public static void Display(int arr[])
    // {
    //     for(int i=0;i<arr.length;i++)
    //     {
    //         System.out.print(arr[i]+" ");
    //     }
    //     System.out.println();
    // }
    public static void main(String args[])
    {
        int arr[]={15,-2,2,-8,1,7,10,23};
        printLargestNum(arr);
    }
}







// Stack<Integer> stack = new Stack<Integer>();
// for(int j=0;j<arr.length;j++){ 
//     stack.clear();

// int dummy = arr[j];
// int sum=dummy;
// stack.push(sum);
// for(int i=j+1;i<arr.length;i++)
// {
//    sum+=arr[i];
//    stack.push(sum);
// }
// for(int i=arr.length;i>=0;--i)
// {
//     int temp = stack.pop();
//     if(temp==dummy)
//     {
//         System.out.println("num: "+i);
//         break;
//     }
// }
// }
