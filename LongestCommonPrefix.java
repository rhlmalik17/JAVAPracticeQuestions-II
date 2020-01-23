import java.util.*;
public class LongestCommonPrefix
{
    public void lcp(String input[])
    {
        Arrays.sort(input,new Comparator<String>(){
            @Override
            public int compare(String A,String B)
            {
                if(A.length()>B.length())
                return 1;
                else if(A.length()<B.length())
                return -1;
                else
                return 0;
            }
        });

    }
    public void display(String arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        String arr[]={ "Hello","Hell","Her","Helloolo"};
        new LongestCommonPrefix().lcp(arr);
    }
}