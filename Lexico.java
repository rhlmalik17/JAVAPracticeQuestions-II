public class Lexico
{
    public void solve(String arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(compare(arr[i], arr[j]))
                {
                    String temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    //    java.util.Arrays.sort(arr);
        display(arr);
    }
    public void display(String arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
           System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
    public boolean compare(String input1,String input2)
    {
        // for(int i=0;i<input1.length();i++)
        // {
        //    if(input1.charAt(i)<input2.charAt(i))
        //    return true;
        // }
        int count=0;
       for(int i=0;i<input1.length() && i<input2.length();i++)
       {
           count++;
           if(input1.charAt(i)==input2.charAt(i))
           {
               continue;
           }
           else
           {
            if(input1.charAt(i)>input2.charAt(i))
            {
                return false;
            }else
            return true;
           }
       }
       if(input1.length()==count)
        return true;
        else
        return false;
    }
    public static void main(String args[]) {
        String arr[]={"hello","abc","cat","day","dream"};
        new Lexico().solve(arr);
    }
}