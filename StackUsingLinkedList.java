public class StackUsingLinkedList
{
    Node head;
    class Node
    {
        int data;
        Node next;
        public Node(int data)
        {
            this.data=data;
            next=null;
        }
    }
    public void push(int x)
    {
        Node newNode = new Node(x);
        if(head==null)
        head=newNode;

        else if(head!=null)
        {
            newNode.next=head;
            head=newNode;
        }
    }
    public String toString()
    {
        StringBuffer temp = new StringBuffer();
        if(head==null)
        {
            return "The list is empty";
        }
        Node a = head;
        while(a!=null)
        {
            temp.append(a.data+" ");
            a=a.next;
        }
        return temp.toString();
    }
    public int pop()
    {
        if(head==null){ 
        System.out.println("List is Empty");
        return -1;
        }
        Node temp = head;
        head = temp.next;
        return temp.data;
    }
    public static void main(String args[])
    {
        StackUsingLinkedList myStack = new StackUsingLinkedList();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);
        System.out.println("Popped the first element: "+myStack.pop());
        System.out.println(myStack);
        
    }
}