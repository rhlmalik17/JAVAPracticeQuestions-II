import java.util.*;
public class LargestNumberInArray{

    public static String returnLargest(String arr[])
    {
        // ArrayList<String> elements = new ArrayList<String>();
        // for(int i=0;i<arr.length;i++)
        // {
        //     elements.add(arr[i]);
        // }
        Arrays.sort(arr, new Comparator<String>()
        {
            @Override
            public int compare(String a,String b)
            {
                return ((b+a).compareTo(a+b));
            }
        });
        String finalString="";
        // for(String e : elements)
        // {
        //    finalString = finalString+e;
        // }
        for(int i=0;i<arr.length;i++)
        {
            finalString+=arr[i];
        }
        return finalString;
    }

    public static void main(String args[])
    {
        String arr[]={"3","30","34","5","9"};
        int arr1[] = {1,2,3};
        String array[] = new String[arr1.length];
        for(int i=0;i<arr1.length;i++)
        {
           array[i]=Integer.toString(arr1[i]);
        }


       System.out.println(returnLargest(array));
    }
}