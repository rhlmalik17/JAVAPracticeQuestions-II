public class BalanceBrackets
{
    public static char openings[]={'{','[','('};
    public static char closings[]={'}',']',')'};
    public static int current;
    public static int current1;
    public static boolean checkIfBalanced(String str)
    {
       
        for(int i=0;i<str.length();i++)
        {
           if(isOpening(str.charAt(i)))
           {
               continue;
           }
           if(isClosing(str.charAt(i)))
           {
                if(current==current1)
                {
                    return false;
                }

           }
            // else if(isClosing(str.charAt(i)))
            // {
               
            //     if(openings[current]!=closings[current])
            //     {
            //         System.out.println("The string is not balance");
            //         return false;
            //     }
                
            // }
        }

        return true;
    }
    public static boolean isOpening(char a)
    {
        for(int i=0;i<openings.length;i++)
        {
            if(openings[i]==a)
            {
                current=i;
                return true;
            }
        }
        return false;
    }
    public static boolean isClosing(char a)
    {
        for(int i=0;i<closings.length;i++)
        {
            if(closings[i]==a)
            { 
                current1=i;
                return true;
            }
        }
        return false;
    }
    public static void main(String args[])
    {
        String testcase1 = "[(a+b)]";
        String testcase2 = "[a+b)";
        String testcase3 = "[{a+b)-c}";
        System.out.println(checkIfBalanced(testcase1)); 

    }
}