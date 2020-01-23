public class PermutationInteger
{
    public void printPerms(int arr[],int index)
    {
        if(index==arr.length-1)
        {
            display(arr);
            return;
        }
        int s=index;
        for(int i=s;i<arr.length;i++)
        {
            swap(arr,s,i);
            printPerms(arr, index+1);
            swap(arr,s,i);
        }
    }
    public void display(int arr[])
    {
        for(Integer e : arr)
        {
            System.out.print(e+" ");
        }
        System.out.println();
    }
    public void swap(int arr[],int i,int j)
    {
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String args[])
    {
        int arr[]={1,2,3};
        new PermutationInteger().printPerms(arr,0);
    }
}