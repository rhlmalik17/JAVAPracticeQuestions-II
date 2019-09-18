public class sortQues
{
    public static void main(String arg[])
    {
        int arr[] = {1,5,2,4,6};
        for(int i=1;i<arr.length;i++)
        {
            int j=i-1; 
            int t=arr[i];
            while(j>=0 && arr[j]>t)
            {
                arr[j+1]=t;
                j--;
            }
            arr[j+1]=t;
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}