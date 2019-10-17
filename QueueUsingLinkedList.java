public class QueueUsingLinkedList
{
    Node front,rear;
    public class Node
    {
        int data;
        Node next;
        public Node(int data)
        {
            this.data=data;
            next=null;
        }
    }
    public void add(int data)
    {
        Node newNode = new Node(data);
        if(front==null)
        {
            front=newNode;
            rear=newNode;
        }
        else if(front==rear)
        {
            rear=newNode;
            front.next=rear;
        }
        else
        {
            Node temp = newNode;
            rear.next=temp;
            rear=temp;
        }
    }
    public void display()
    {
        if(front==null)
        {
            System.out.println("Queue is empty");
            System.exit(0);
        }
        else if(front==rear)
        {
            System.out.println(front.data);
        }
        else if(front!=rear && front!=null && rear!=null)
        {
            Node temp = front;
            while(temp!=null)
            {
                System.out.println(temp.data+" ");
                temp=temp.next;
            }
        }
    }
    public int remove()
    {
        if(front==null)
        {
            System.out.println("Queue is empty");
            System.exit(0);
        }
        else if(front==rear)
        {
            int temp = front.data;
            front=null;
            rear=null;
            return temp;
        }
        else if(front!=rear && front!=null && rear!=null)
        {
            Node temp = front;
            front=front.next;
            return temp.data;
        }
        return 0;
    }
    public static void main(String args[])
    {
        QueueUsingLinkedList obj = new QueueUsingLinkedList();
        obj.add(1);
        obj.add(2);
        obj.add(3);
        obj.add(4);
        obj.add(5);
        obj.add(6);
        obj.display();
    }
}