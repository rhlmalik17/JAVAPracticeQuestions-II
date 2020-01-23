public class RecursionX
{
    int index=0;
    int noOfx=0;
    String result="";
    public void shiftx(String input)
    {
        traverse(input);
        while(noOfx-- > 0)
        {
            result+='x';
        }
        System.out.println(result);
    }
    public void traverse(String input)
    {
        if(index>=input.length())
        {
            return;
        }
        if(input.charAt(index)!='x')
        {
            result+=input.charAt(index);
        }
        else if(input.charAt(index)=='x')
        {
            noOfx++;
        }
        index++;
        traverse(input);
    }
    public static void main(String args[])
    {
        new RecursionX().shiftx("axvmnxpo");
    }
}