

public class BinarySearch
{
    public static boolean checkElement(int arr[], int a)
    {
        int end=arr.length-1,start=0,mid=arr.length/2,len=arr.length;
        boolean result=false;
        while(!result)
        {
            if(len==0)
            {
                result=true;
            }
            if(arr[mid]==a || arr[start]==a || arr[end]==a)
            {
                
                return true;

            }
            else if(a<arr[mid])
            {
                end=mid;
                mid=start+(end/2); 
                len=len/2;
            }
            else if(a>arr[mid])
            {
                start=mid;
                mid = (start+end)/2;
                len=len/2;
            }
            
        }
        return false;
    }
    public static void main(String args[])
    {
        int arr[]={41,25,24,51,25,6,76,23};
        java.util.Arrays.sort(arr);
        System.out.println(checkElement(arr,23));
       
    }
}