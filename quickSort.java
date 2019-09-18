public class quickSort
{
    public void sortIt(int arr[],int s, int e)
    {
        if(s<e)
        {
            int p=partition(arr,s,e);
            sortIt(arr,s,p-1);
            sortIt(arr,p+1,e);
        }
    }
    public int partition(int arr[],int s,int e)
    {
        int k=s;
        
            for(int i=s;i<e;i++)
            {
                if(arr[i]<=arr[e])
                {
                    int temp=arr[i];
                    arr[i]=arr[k];
                    arr[k]=temp;
                    k++;
                }
            }
        int temp = arr[k];
        arr[k]=arr[e];
        arr[e]=temp;
        return k;
    }
    public static void Display(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[])
    {
        quickSort obj = new quickSort();
        int arr[]={15,10,9,6,5,16,11};
        obj.sortIt(arr,0,arr.length-1);
        Display(arr);
    }
}