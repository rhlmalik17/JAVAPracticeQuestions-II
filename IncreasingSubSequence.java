import java.util.*;

public class IncreasingSubSequence {
   static int max=Integer.MIN_VALUE;
    
   public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       int n = s.nextInt();
       int[] arr = new int[n];
       for (int i = 0; i < n; i++)
           arr[i] = s.nextInt();
       int k = s.nextInt();
       numberOfIncresingSubSequences(arr, n, k);
   }
   
   static void numberOfIncresingSubSequences(int[] arr, int n, int k) {
       // Write your code here
        for(int i=0;i<arr.length;i++)
        {
            traverse(arr,arr[i]+"",i);
        }
        System.out.println(max);
   }
   public static void traverse(int arr[],String input,int index)
   {
       if(index>=arr.length)
       {
           return;
       }

       if(max<input.length())
       {
            max=input.length();
       }
       
       for(int i=index;i<arr.length;i++)
       {
           if(arr[i]>arr[index])
           {
               String temp = input;
                temp+=arr[i]+"";
                traverse(arr,temp,i);
           }
       }
       
       
   }
}