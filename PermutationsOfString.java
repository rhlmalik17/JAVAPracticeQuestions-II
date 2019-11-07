import java.util.HashSet;

public class PermutationsOfString
{
    public static HashSet<String> perms = new HashSet<>();
    public static int fixedindex = 1;
    public void printPurms(String input)
    {
        char[] arr = input.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            char temp = arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
            recurseAndAdd(arr);
            temp = arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
        }

    }
    public void recurseAndAdd(char[] arr)
    {
        String temp="";
        for(int i=0;i<arr.length;i++)
        temp+=arr[i];
        System.out.println(temp);
    }
    public static void main(String args[])
    {
        PermutationsOfString obj = new PermutationsOfString();
        obj.printPurms("ABCD");
    }
}