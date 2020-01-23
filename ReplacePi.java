public class ReplacePi
{
    int index=0;
    String result="";
    public void replace(String input)
    {
        traverse(input);
    }
    public void traverse(String input)
    {
        if(index>=input.length())
        {
            return;
        }
        if(index<(input.length()-2) && input.charAt(index)=='p')
        {
            String temp = input.charAt(index)+input.charAt(index+1)+"";
            if(temp.equals("pi"))
            {
                result+="3.14";
                index=index+2;
            }
        }
        else
        {
            result+=input.charAt(index);
            index++;
        }
        traverse(input);
        
    }
    public static void main(String args[])
    {
        String temp="a#b+fj+pi+2";
        new ReplacePi().replace(temp);
    }
}