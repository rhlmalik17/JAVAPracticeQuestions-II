import java.util.Scanner;
import java.util.HashMap;
public class RelativeSorting
{
    public static Scanner taker = new Scanner(System.in);

    public void sortIt(int arr1[],int arr2[])
    {
        HashMap<Integer,Integer> reps = new HashMap<>();
        for(int i=0;i<arr2.length;i++)
        reps.put(arr2[i],0);
       

        for(int i=0;i<arr1.length;i++)
        {
            if(reps.containsKey(arr1[i]))
            {
                int value = reps.get(arr1[i]);
                reps.replace(arr1[i],++value);
                arr1[i]=0;
            }
        }
        
        int array[] = new int[arr1.length];
        int index=0;
        for(int i=0;i<arr2.length;i++)
        {
            int freq = reps.get(arr2[i]);
            for(int j=0;j<freq;j++)
            {
                array[index]=arr2[i];
                index++;
            }
        }
      
       
        java.util.Arrays.sort(arr1);
        
        for(int i=index;i<arr1.length;i++)
        {
            array[i]=arr1[i];
            
        }
        display(array);
    }
    public void display(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        System.out.print(arr[i]+" ");
        System.out.println();
    }
    public static void main(String args[])
    {
    //    int arr1[]={2,1,2,5,7,1,9,3,6,8,8};
    //    int arr2[]={2,1,8,3};
    //    new RelativeSorting().sortIt(arr1,arr2);
        int tc = taker.nextInt();
        for(int i=0;i<tc;i++)
        {
            int array1[]=new int [taker.nextInt()];
            int array2[]= new int [taker.nextInt()];
            for(int j=0;j<array1.length;j++)
            {
                array1[j]=taker.nextInt();
            }
            for(int j=0;j<array2.length;j++)
            {
                array2[j]=taker.nextInt();
            }
            new RelativeSorting().sortIt(array1,array2);
            
        }
    }
}