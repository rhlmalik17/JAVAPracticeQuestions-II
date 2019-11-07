import java.util.*;
public class QueueUsingSingleStack
{
    Stack<Integer> stack = new Stack<Integer>();

    public void add(int data)
    {
       if(stack.size()==0)
       {
           stack.push(data);
       }
       else if(stack.size()==1)
       {
            int temp = stack.pop();
            stack.push(data);
            stack.push(temp);
       }
       else
       {
           recurseAndAdd(data);
       }
    }
    public int recurseAndAdd(int data)
    {
        int temp;
       if(stack.size()==0)
       {
           stack.push(data);
          
       }
       else
       {
         temp = stack.pop();
         recurseAndAdd(data);
         stack.push(temp);
         return 0;
       }
       return 0;
    }
    public int peek()
    {
        return stack.peek();
    }
    public int remove()
    {
        return stack.pop();
    }
    public void Display()
    {
       int n = stack.size();
       Stack<Integer> que = new Stack<Integer>();
       for(Integer e : stack)
       {
           que.push(e);
       }
       for(int i=0;i<n;i++)
       {
           System.out.print(que.pop()+" ");
       }
    }
    public static void main(String args[])
    {
        QueueUsingSingleStack obj = new QueueUsingSingleStack();
            obj.add(5);
            obj.add(6);
            obj.add(7);
            obj.add(8);
            obj.add(9);
             obj.add(10);
            obj.add(11);
              obj.Display();
            System.out.println("Removed Element: "+obj.remove());
            System.out.println("Removed Element: "+obj.remove());
           
            obj.Display();
        
    }
}