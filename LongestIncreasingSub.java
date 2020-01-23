public class LongestIncreasingSub
{
    static int max=Integer.MIN_VALUE;
    public int lengthOfLIS(int[] arr) {
        if(arr.length==0)
            return 0;
        int aux[]=new int[arr.length];
        initialise(aux);
        int x=0;
        int max=0;
        for(int i=1;i<arr.length;i++)
        {

            int temp = -1;
            for(int j=0;j<i;j++)
            {
                if(arr[j]<arr[i])
                {
                  if(temp<aux[j])
                    temp=aux[j];
                }
            }
           
            if(temp>=aux[i])
            {
                aux[i]+=temp;
            }
            

            if(aux[i]>max)
                max=aux[i];
        }
        
        return max;
    
    }
public void initialise(int arr[])
{
    for(int i=0;i<arr.length;i++)
    {
        arr[i]=1;
    }
}
    public static void main(String args[])
    {
        int arr[]={10,9,2,5,3,7,101,18};
        System.out.println(new LongestIncreasingSub().lengthOfLIS(arr));
    }
}