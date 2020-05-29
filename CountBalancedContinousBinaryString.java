import java.util.*;
/*WRONG SOLUTION BC*/
public class CountBalancedContinousBinaryString
{
    public int solve(String input)
    {
        int count=0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        grouping(list, input);
        System.out.println(list);
        if(list.size()==1)
        {
            return list.get(0);
        }
        int first = list.remove(0);
        int second = list.remove(0);
        // System.out.println(first+" "+second);
        while(true)
        {
            if(first==second)
            count+=1;
            else
            {
                count+=Math.min(first,second);
            }
            if(list.isEmpty())
            break;
            first=second;
            second=list.remove(0);
            // System.out.println(first+" "+second);
        }
        return count;
    }
    public void grouping(ArrayList<Integer> list,String input)
    {
        for(int i=0;i<input.length();)
        {
            if(input.charAt(i)=='0')
            {
                int count=0;
                while(i<=input.length()-1 && input.charAt(i)!='1')
                {
                    i++;
                    count++;
                }
                list.add(count);
            }
            if(i<=input.length())
            break;
            if(input.charAt(i)=='1')
            {
                int count=0;
                while(i<=input.length()-1 && input.charAt(i)!='0')
                {
                    i++;
                    count++;
                }
                list.add(count);
            }
        }
    }
    public static void main(String arg[])
    {
       System.out.println(new CountBalancedContinousBinaryString().solve("0101"));
    }
}