public class PSAllPossibleSubSets
{
    public void solve(int arr[])
    {
        int product = 1;
        for(int i=0;i<arr.length;i++)
        {
            arr[i]++;
            product*=arr[i];
        }
        System.out.println(product-1);
    }
    public static void main(String args[])
    {
        int arr[]={1,2,3};
        new PSAllPossibleSubSets().solve(arr);
    }
}