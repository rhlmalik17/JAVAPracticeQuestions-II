import java.util.*;
public class FirstUniqueElement
{
    public static void printFirstUnique(String input)
    {
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i=0;i<input.length();i++)
        {
            if(hm.containsKey(input.charAt(i)))
            {
                int temp = hm.get(input.charAt(i));

                hm.replace(input.charAt(i),++temp);
            }
            else{ 
            hm.put(input.charAt(i),1);
            }
        }
        // System.out.println(hm);
        Set<Character> keys = hm.keySet();
        char a='0';
        for(int i=0;i<input.length();i++)
        {
            if(hm.get(input.charAt(i))==1)
            {
                System.out.println(input.charAt(i));
                break;
            }
        }
        // System.out.println(a);
    }
    public static void main(String args[])
    {
        printFirstUnique("aaaibbbffjccc");
    }
}