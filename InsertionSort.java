public class InsertionSort
{
    public static void insertionSort(int arr[])
    {
      int t;
       for(int i=1;i<arr.length;i++)
       {
           t=i;
           
               for(int j=i-1;j>=0;--j)
               {
               
                 if(arr[t]<arr[j])
                 {
                     int temp=arr[j];
                     arr[j]=arr[t];
                     arr[t]=temp;
                     t--;
                     
                 }
               }
           
          
       }
       for(int i=0;i<arr.length;i++)
       {
          System.out.print(arr[i]+" ");
       }
       
    }
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5};
        insertionSort(arr);

    }
}