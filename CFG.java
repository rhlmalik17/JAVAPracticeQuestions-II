/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;


public class CFG {
    public static Stack<Character> stack = new Stack<Character>();
    public static Scanner taker = new Scanner(System.in);
    public static boolean isOpening(char a)
    {
    if(a=='{' || a=='[' || a=='(')
    return true;
    else
    return false;
    }

public static boolean isClosing(char a)
{
    if(a=='}' || a==']' || a==')')
    return true;
    else
    return false;
}
public static void checkIfBalanced(String input)
{
    for(int i=0;i<input.length();i++)
    {
       
        if(isOpening(input.charAt(i)))
        {
            stack.push(input.charAt(i));
        }
        else if(isClosing(input.charAt(i)))
        {
            char temp = input.charAt(i);
            if(temp==')')
            {
                if(stack.peek()!='('){
                System.out.println("not balanced");
                return;
                }
                else if(stack.peek()=='(')
                stack.pop();
            }
           else if(temp=='}')
            {
                if(stack.peek()!='{'){
                System.out.println("not balanced");
                return;
                }
                else if(stack.peek()=='{')
                stack.pop();
            }
             else if(temp==']')
            {
                if(stack.peek()!='['){
                System.out.println("not balanced");
                return;
                }
                else if(stack.peek()=='[')
                stack.pop();
            }
        }
    }
    if(stack.size()==0)
    System.out.println("balanced");
    else
    System.out.println("not balanced");
}    
    
	public static void main (String[] args) {
		//code
	
        int testcases = taker.nextInt();
        taker.nextLine();
		for(int i=0;i<testcases;i++)
		{
		    checkIfBalanced(taker.nextLine());
		}
		
	}
}