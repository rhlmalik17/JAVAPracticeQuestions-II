public class Subsets
{
    public void printSubSets(int arr[])
    {
        int num = (int) Math.pow(2,arr.length);
        int sum=0;
        for(int i=0;i<num;i++) 
        {
            int product=1;

            for(int j=0;j<arr.length;j++)
            {
                if((i & (1 << j))!=0)
                {
                    product*=arr[j];
                    // System.out.printf(arr[j]+" ");
                }
            }
            sum+=product;
            // System.out.println();
        }
        System.out.println(sum);
    }
    public static void main(String args[])
    {
        int arr[]={3,5,1,6};
        // System.out.println(1<<0);
        new Subsets().printSubSets(arr);
    }
}