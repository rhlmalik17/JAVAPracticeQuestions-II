/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;


public class CountLongestParenthesis {
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
public static int returnParenthesisCount(String input)
{
  int count=0;
    for(int i=0;i<input.length();i++)
    {
        if(isOpening(input.charAt(i)))
        {
            stack.push(input.charAt(i));
        }
        else if(isClosing(input.charAt(i)) && stack.isEmpty()==false)
        {
            boolean a = false;
            char temp = input.charAt(i);
            if(temp==')' && stack.peek()=='(')
            {
                count+=2;
                stack.clear();
                a = true;
            }
            if(temp=='}' && stack.peek()=='{')
            {
                count+=2;
                stack.pop();
                a = true;
            }
            if(temp==']' && stack.peek()=='[')
            {
                count+=2;
                stack.pop();
                a = true;
            }
            if(!a)
            {
                count=0;
            }
        }
    }
    return count;
}    
    
	public static void main (String[] args) {
		//code
	
        int testcases = taker.nextInt();
        taker.nextLine();
		for(int i=0;i<testcases;i++)
		{
            System.out.println(returnParenthesisCount(taker.nextLine()));
            stack.clear();
		}
	}
}