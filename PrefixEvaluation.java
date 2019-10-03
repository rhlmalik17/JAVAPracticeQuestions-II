import java.util.ArrayList;
import java.util.Stack;

public class PrefixEvaluation {

    public class Solution {
     public int evalRPN(ArrayList<String> A) {
            int sum=0,one=0,two=0;
            if(A.size()==1){
            return Integer.parseInt(A.get(0));
            }
            Stack<Integer> stack = new Stack<>();
            
            for(String s : A)
            {
                
                try
                {
                    int temp = Integer.parseInt(s);
                    stack.push(temp);
                }
                catch(Exception e){
                    switch(s)
                    {
                       case "+":
                       one = stack.pop();
                       two = stack.pop();
                       sum = one + two;
                       stack.push(sum);
                       break;
                        case "-":
                       one = stack.pop();
                       two = stack.pop();
                       sum = two - one;
                       stack.push(sum);
                       break;
                        case "*":
                       one = stack.pop();
                       two = stack.pop();
                       sum = one * two;
                       stack.push(sum);
                       break;
                        case "/":
                       one = stack.pop();
                       two = stack.pop();
                       sum = two / one;
                       stack.push(sum);
                       break;
                    }
                }
            }
            return stack.peek();
            
            
        }
    }
    
    public static void main(String args[])
    {
       
    }
}