import java.security.KeyStore.Entry;
import java.util.HashMap;

public class FirstUniqueChar
{
    public int solve(String input)
    {
       HashMap<Character,Integer> map = new HashMap<Character,Integer>();
       for(int i=0;i<input.length();i++)
       {
           if(map.containsKey(input.charAt(i)))
           {
               int temp = map.get(input.charAt(i));
               map.put(input.charAt(i), ++temp);
           }else
           {
               map.put(input.charAt(i),1);
           }
       }
       for(int i=0;i<input.length();i++)
       {
           if(map.get(input.charAt(i))==1)
           return i;
       }
       return -1;
    }
    
    // public int solve(String input)
    // {
    //     input = input.toLowerCase();
    //     String c = input.charAt(0)+"";
    //     for(int i=1;i<input.length();i++)
    //     {
    //         String temp = input.charAt(i)+"";
    //         if(!c.contains(temp))
    //         {
    //             c+=temp;
    //         }else
    //         {
    //             // c = deleteChar(c,temp);
    //             c = c.replace(temp,"");
    //         }
    //     }
    //     if(c.length()==0)
    //     return -1;
    //     else
    //     return input.indexOf(c.charAt(0));
    // }
    // public String deleteChar(String input,String temp)
    // {
    //     Character chr = temp.charAt(0);
    //     String a = "";
    //     for(int i=0;i<input.length();i++)
    //     {
    //         if(input.charAt(i)!=chr)
    //         {
    //             a+=input.charAt(i);
    //         }
    //     }
    //     return a;
    // }
    public static void main(String args[])
    {
        System.out.println(new FirstUniqueChar().solve("haiaaaha"));
    }
}