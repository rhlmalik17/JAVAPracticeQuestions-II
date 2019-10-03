import java.util.Collections;
import java.util.Stack;
public class InfixToPostfix{
    public static boolean ifOperator(char input)
    {
        char arr[]={'+','-','*','/','(',')'};
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==input)
            {
                return true;
            }
        }
        return false;
    }

    public static int getPrecedance(char input)
    {
        int precedance=0;

        switch(input)
        {
            case '+':
            precedance=2;
            break;
            case '-':
            precedance=2;
            break;
            case '*':
            precedance=3;
            break;
            case '/':
            precedance=3;
            break;
            case '(':
            precedance=1;
            break;
            case ')':
            precedance=1;
            break;
        }

        return precedance;
    }

    public static void infixToPostFix(String input)
    {
        StringBuffer postFix = new StringBuffer();
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<input.length();i++)
        {
            if(ifOperator(input.charAt(i)))
            {
                if(stack.isEmpty())
                {
                    stack.push(input.charAt(i));
                }
                else
                {
                    if(input.charAt(i)=='(')
                    {
                        stack.push(input.charAt(i));
                    }
                    else if(input.charAt(i)==')')
                    {
                        while(stack.isEmpty()==false && stack.peek()!='(')
                        {
                            postFix.append(stack.pop());
                        }
                      stack.pop();
                    }
                    else
                    {
                        while(stack.isEmpty()==false && getPrecedance(input.charAt(i))<getPrecedance(stack.peek()))
                        {
                            postFix.append(stack.pop());
                        }
                        stack.push(input.charAt(i));
                    }
                }
            }
            else
            {
                postFix.append(input.charAt(i));
            }
        }
        System.out.println(postFix.toString());
    }
    public static void main(String args[])
    {
        infixToPostFix("A+B-C");
    }
}