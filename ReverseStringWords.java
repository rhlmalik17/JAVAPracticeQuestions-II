public class ReverseStringWords
{
    public String reverseString(String input)
    {
        String arr[]=input.split(" ");
        String temp="";
        for(int i=arr.length-1;i>=0;--i)
        {
            temp+=arr[i]+" ";
        }
        return temp;
    }
    public String reverseWord(String input)
    {
        StringBuffer temp = new StringBuffer(input);
        return temp.reverse().toString();
    }
    public static void main(String args[])
    {
        String word = "Quick Brown fox Jumped";
        System.out.println(new ReverseStringWords().reverseString(word)); 
        System.out.println(new ReverseStringWords().reverseWord(word)); 
    }
}