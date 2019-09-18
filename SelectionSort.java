public class SelectionSort
{
    public static void sortIt(int arr[])
    {
     for(int i=0;i<arr.length;i++)
     {
         int min=i;
         for(int j=i+1;j<arr.length;j++)
         {
             if(arr[min]>arr[j])
             {
                 min=j;
             }

         }
         if(min!=i)
         {
             int temp=arr[i];
             arr[i]=arr[min];
             arr[min]=temp;
         }
     }

    }
    public static void main(String args[])
    {
        int arr[]={16,17,7,8,9};
        sortIt(arr);
        for(int i=0;i<arr.length;i++)
        System.out.println(arr[i]);

    }
}