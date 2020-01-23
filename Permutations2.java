import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;
public class Permutations2
{
    public SortedSet<String> perms = new TreeSet<String>();
    public int fixedindex = 0;
    public void printPurms(String input)
    {
        char[] arr = input.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            swap(arr,0,i);
            recurseAndAdd(arr,fixedindex);
            swap(arr,0,i);
        }
        System.out.println(perms.size());
        // display();
    }

    public void swap(char arr[],int index1,int index2)
    {
        char temp = arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
    public void recurseAndAdd(char[] arr,int index)
    {
        if(index==arr.length-1)
        {
            addToHashSet(arr);
            print(arr);
            return;
        }
        int s=index;
        for(int i=s;i<arr.length;i++)
        {
            swap(arr,s,i);
            recurseAndAdd(arr,index+1);
            swap(arr,s,i);
        }
        
    }
    public void print(char[] arr)
    {
        String temp="";
        for(int i=0;i<arr.length;i++)
        temp+=arr[i];
        System.out.println(temp);
    }
    public void addToHashSet(char arr[])
    {
        String temp="";
        for(int i=0;i<arr.length;i++)
        temp+=arr[i];
        perms.add(temp);
    }
    public void display()
    {
        for(String e : perms)
        {
            System.out.println(e);
        }
    }
    public static void main(String args[])
    {
        Permutations2 obj = new Permutations2();
        String tc = "ABC";
        char[] arr = tc.toCharArray();
        obj.recurseAndAdd(arr, 0);

     
    }
}