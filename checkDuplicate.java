public class checkDuplicate
{
    public static int getUnique(int[] arr,int reps)
    {
        int sum=0;
        int x = 0;
        for(int i=0;i<32;i++)
        {
            sum=0;
            for(int j=0;j<arr.length;j++)
            {
                int temp = arr[j] & (1<<i);
                if(temp>0)
                {
                    sum++;
                }

            }
            int temp = sum % reps;
            if(temp!=0)
            {
                x = x | (1<< i);
            }

        }
        return x;
    }
    public static void main(String args[]) 
    {
        int arr[] = {1,1,1,2,3,3,3};
        System.out.println(getUnique(arr,3));
        
    }
}