
    import java.util.*;
    class Node
    {
        int data;
        Node next;
        
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
public class LinkedListQuestionn
    {
         Node head;  
        
        /* Function to print linked list */
        void printList(Node head)
        {
            Node temp = head;
            while (temp != null)
            {
               System.out.print(temp.data+" ");
               temp = temp.next;
            }  
            System.out.println();
        }
        
     
        /* Inserts a new Node at front of the list. */
        public void addToTheLast(Node node) 
        {
            if (head == null) 
            {
                head = node;
            } else 
            {
               Node temp = head;
               while (temp.next != null)
               temp = temp.next;
               temp.next = node;
            }
        }
        
        public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
             
            while(t>0)
            {
                int n = sc.nextInt();
                //int k = sc.nextInt();
                LinkedListQuestionn llist = new LinkedListQuestionn();
                //int n=Integer.parseInt(br.readLine());
                int a1=sc.nextInt();
                Node head= new Node(a1);
                llist.addToTheLast(head);
                for (int i = 1; i < n; i++) 
                {
                    int a = sc.nextInt(); 
                    llist.addToTheLast(new Node(a));
                }
                
                Palindrome g = new Palindrome();
                if(g.isPalindrome(llist.head) == true)
                System.out.println(1);
            else
                System.out.println(0);
                t--;
            }
            
        }
    }
    
    
    /*This is a function problem.You only need to complete the function given below*/
    /* Structure of class Node is
    class Node
    {
        int data;
        Node next;
        
        Node(int d)
        {
            data = d;
            next = null;
        }
    }*/
    class Palindrome
    {
        // Function to check if linked list is palindrome
        boolean isPalindrome(Node head) 
        {
            int count=0;
           Stack<Node> stack = new Stack<Node>();
           Node temp = head;
           while(temp!=null)
           {
               stack.push(temp);
               temp=temp.next;
           }
           int size = stack.size();
           temp=head;
           while(stack.size()!=0){
             
               if(stack.pop().data==temp.data)
               {
                   count++;
               }
               temp=temp.next;
           }
          
           if(count==size)
           {
               return true;
           }
           else
           return false;
        }    
    }
    