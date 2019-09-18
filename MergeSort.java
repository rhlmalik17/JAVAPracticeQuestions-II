public class MergeSort
{
    public static void mergeSort(int arr[],int s,int e)
    {
        
        if(s<e)
        {
            int mid=(s+e)/2;
            mergeSort(arr, s, mid);
            mergeSort(arr, mid+1, e);  
            merge(arr,s,mid,mid+1,e);

        }
    }
    public static void merge(int arr[],int a1,int a2,int b1,int b2)
    {
       int elements= (a2-a1+1) + (b2-b1+1);
       int array[]=new int[elements];
       int ind=0;
       
        for(int i=a1;i<=a2;i++)
        {
            array[ind]=arr[i];
            ind++;
        }
        for(int i=b1;i<=b2;i++)
        {
            array[ind]=arr[i];
            ind++;
        }
        java.util.Arrays.sort(array);
        ind=0;
        for(int i=a1;i<=b2;i++)
        {
            arr[i]=array[ind];
            ind++;
        }
      
       int temp=0;
       for(int i=a1;i<=a2;i++)
       {
           arr[i]=array[temp];
           temp++;
       }
      
       for(int i=b1;i<=b2;i++)
       {
           arr[i]=array[temp];
           temp++;
       }

    }

    public static void main(String args[])
    {
        int arr[]={2,4,3,6,10,9,12};
       mergeSort(arr, 0, arr.length-1);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}