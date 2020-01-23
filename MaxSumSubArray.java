public class MaxSumSubArray
{
    public static void main(String args[])
    {
        int arr[]={-2,5,-1};
        System.out.print(new MaxSumSubArray().getSum(arr));
        System.out.println();
    }
    public int getSum(int arr[])
    {
        int max=0,max_Overall=0;
        for(int i=0;i<arr.length;i++)
        {
            max+=arr[i];
            if(max<0)
            {
                max=0;
            }
            if(max>max_Overall)
            {
                max_Overall=max;
            }
        }
        return max_Overall;
    }
}