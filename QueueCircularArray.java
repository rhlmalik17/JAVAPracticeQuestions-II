/*
    QUEUE USING CIRCULAR ARRAYS
*/

public class QueueCircularArray
{
    int arr[],length;
    int front=-1,rear=-1;
    public QueueCircularArray()
    {
        arr=new int[4];
        length=arr.length;
    }
    public void add(int data)
    {
        if(Math.abs(front-rear)==1)
        {
            System.out.println("UnderFlow");
            System.exit(0);
        }
        else if(Math.abs(front-rear)==0)
        {
            int index = (rear+1)%length;
            arr[index]=data;
            rear=index;
        }
        else
        {
            int index = (rear+1)%length;
            arr[index]=data;
            rear=index;
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
        int temp = front;
        while(temp!=front)
        {
            System.out.print(arr[temp]+" ");
            temp=(temp+1)%arr.length;
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
        obj.remove();
        obj.add(5);
        obj.display();
    }
}