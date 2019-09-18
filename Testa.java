public class Testa
{
    public static boolean aest(int inputArr[], int key)
    {
        int start=0,end=inputArr.length-1,mid=0;
        
        while (start <= end) {
            mid = (start + end) / 2;
            if (key == inputArr[mid]) {
                return true;
            }
            if (key > inputArr[mid]) {
                end = mid-1;
            } else {
                start = mid + 1;
            }
          }
          return false;

    }
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5};
        int key = 2;
        System.out.println(aest(arr, key));
    }
}