import java.util.*;
public class StackUsingTwoQueues
{
    Queue<Integer> que1 = new LinkedList<Integer>();
    Queue<Integer> que2 = new LinkedList<Integer>();

    public void push(int data)
    {
        que2.add(data);
    }
    public int pop()
    {
        if(que2.size()==0)
        return -1;

        else if(que2.size()==1)
        return que2.remove();

        else
        {
          while(que2.size()!=1)
          { 
            que1.add(que2.remove());
          }
          Queue<Integer> temp = que1;
          que1=que2;
          que2=temp;
          return que1.remove();
        }
     }

     public void display()
     {
        int arr[] = new int[que2.size()];
        Queue<Integer> temp = que2;
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=temp.remove();
        }
        for(int i=arr.length-1;i>=0;i--)
        {
            System.out.println(arr[i]+" ");
        }
     }
    public static void main(String[] args){

        StackUsingTwoQueues obj = new StackUsingTwoQueues();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        obj.push(5);
        System.out.println(obj.pop());
    }
}