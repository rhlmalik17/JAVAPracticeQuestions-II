import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;

public class SubContinousString
{
    public void solve(String input1,String input2)
    {
        Stack<Character> myStack = new Stack<Character>();
        HashSet<Character> isVisited = new HashSet<>();
        ArrayList<Character> list= new ArrayList<Character>();
        for(int i=0;i<input2.length();i++)
        {
            for(int j=0;j<input1.length();j++)
            {
                if(input1.charAt(j)==input2.charAt(i))
                {
                    list.add(input1.charAt(j));
                }
            }
        }
        Display(list);
        String result="";
        for(int i=0;i<input1.length();i++)
        {
            if(list.contains(input1.charAt(i)))
            {
                myStack.push(input1.charAt(i));
            }
        }
        int i=list.size()-1;
        
        while(i>=0)
        {
            if(myStack.peek()==list.get(i))
            {
                result+=myStack.pop();
                --i;
            }
            else if(myStack.peek()!=list.get(i))
            {
                if(isVisited.contains(myStack.peek()))
                {
                    myStack.pop();
                }
                else{
                    isVisited.add(list.get(i));
                    --i;
                }
                
            }
        } 
        StringBuffer obj = new StringBuffer(result);
        System.out.println(obj.reverse());
    }
    public void Display(ArrayList<Character> list)
    {
        for(Character e: list)
        {
            System.out.print(e);
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        new SubContinousString().solve("amxabcdefghnvpolk","mnxzoplkabcdefgh");
    }
}