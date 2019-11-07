import java.util.*;
public class QueueUsingTwoStack
{
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void add(int data)
    {
        if(stack2.isEmpty())
        {
            stack2.push(data);
        }
        else
        {
            stack2.push(data);
            while(stack2.size()>0)
            {
                stack1.push(stack2.pop());
            }
            stack2=stack1;
            stack1.clear();
        }
    }


}