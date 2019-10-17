/*
    QUEUE USING ARRAYS
*/

public class QueueDS
{
    int[] arr;
    int front=-1,rear=-1;
    public QueueDS()
    {
        arr=new int[100];
    }
    public void add(int data)
    {
        if(front==-1)
        {
            front++;
            rear++;
            arr[front]=data;
        }
       else
       {
            rear++;
            arr[rear]=data;
       }
    }
    public int remove()
    {
        if(front==-1)
        {
            System.out.println("UnderFlow");
            System.exit(0);
        }
        else if(front==rear)
        {
            int temp = arr[front];
            front=-1;
            rear=-1;
            return temp;
        }
        else
        {
            int temp = arr[front];
            front++;
            return temp;
        }
        return 0;
    }
    public void display()
    {
        if(front==rear)
        System.out.println(arr[front]);
        else if(front==-1)
        {
            System.out.println("Queue is empty");
        }
        else if(front!=rear && front!=-1 && rear!=-1)
        {
            for(int i = front;i<=rear;i++)
            {
                System.out.println(arr[i]+" ");
            }
        }
    }
    public int peek()
    {
        if(front==-1)
        {
            System.out.println("Queue is empty");
            System.exit(0);
        }
        else
        return arr[front];
        return 0;
    }
    public static void main(String args[])
    {
        QueueDS obj = new QueueDS();
        obj.add(1);
        obj.add(2);
        obj.add(3);
        obj.add(4);
        obj.add(5);
        System.out.println(obj.peek());
    }
}