import java.util.*;
public class StackUsingOneQueue{
    Queue<Integer> que = new LinkedList<Integer>();
    public void push(int data)
    {
        if(que.isEmpty())
        {
            que.add(data);
        }
        else if(que.size()==1)
        {
            int temp = que.remove();
            que.add(data);
            que.add(temp);
        }
        else
        {
            que.add(data);

             int count = que.size();
             while(count>1)
            {
                 int temp = que.remove();
                 que.add(temp);
               --count;
            }
            // que.add(data);
        }
    }

    public int pop()
    {
        if(que.isEmpty())
        return -1;
        else
        return que.remove();
    }
    public void display()
    {
        for(Integer e : que)
        {
            System.out.print(e+" ");
        }
    }
    public static void main(String args[])
    {
        StackUsingOneQueue obj = new StackUsingOneQueue();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        obj.display();
      
    }
}