public class ReverseVowels
{
    public String reverseVowels(String input)
    {
        // String vowels="";
        // String rev="";
        // for(int i=0;i<input.length();i++)
        // {
        //     char temp = input.charAt(i);
        //     if(temp=='a' || temp=='e' || temp=='i' || temp=='o' || temp=='u')
        //     vowels+=temp;
        // }
        // int index=vowels.length()-1;
        // for(int i=0;i<input.length();i++)
        // {
        //     char temp = input.charAt(i);
        //     if(temp=='a' || temp=='e' || temp=='i' || temp=='o' || temp=='u')
        //     {
        //         rev+=vowels.charAt(index);
        //         index--;
        //         continue;
        //     }
        //     rev+=input.charAt(i);
        // }
        StringBuffer sb = new StringBuffer(input);
        traverse(sb);
        return sb.toString();
    }
    public boolean isVowel(char input)
    {
        char temp = input;
        if(temp=='a' || temp=='e' || temp=='i' || temp=='o' || temp=='u')
        return true;

        return false;
    }
    public void traverse(StringBuffer input)
    {
        int i=0;
        int j=input.length()-1;
        while(i<=j)
        {   
            if(!isVowel(input.charAt(i)))
            i++;
            if(!isVowel(input.charAt(j)))
            j--;

            if(isVowel(input.charAt(i)) && isVowel(input.charAt(j)))
            {
                char temp = input.charAt(j);
                input.setCharAt(j, input.charAt(i));
                input.setCharAt(i, temp);
                i++;
                --j;
            }

        }
          
    }


    public static void main(String args[])
    {
        System.out.println(new ReverseVowels().reverseVowels("amivnpomxen"));   
    }
}