import java.util.HashMap;
public class SubArrayWithSum0
{
    public static void subArray(int arr[])
    {
        HashMap<Integer,Integer> mp = new HashMap<>();
        int sum=0;
        int max = 0;
        int a=0;
        int b=0;
        for(int i=0;i<arr.length;i++)
        {

            sum+=arr[i];
            if(mp.containsKey(sum) || sum==0)
            {
                if(sum==0)
                {
                    a=0;
                    b=i;
                    max = i+1;
                }else{ 
                int temp=(i-mp.get(sum));
                if(temp>max){ 

                  a=mp.get(sum)+1;
                  b=i;  
                 max=temp;
                }
                }
            }
            else
            {
                mp.put(sum,i);
            }
        }
      display(arr,a,b);
    }
    public static void display(int arr[],int a,int b)
    {
        for(int i=a;i<=b;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        int arr[]={1,2,3,-3};
        subArray(arr);
    }
}