/*Stack Using Arrays*/
public class Stack
{
    int arr[];
    int top;
    int expandBy=2;
    public Stack()
    {
        arr=new int[2];
        top=-1;
    }
    public void push(int a)
    {
        if(top==arr.length-1)
        {
            int newArray[] = new int[expandBy*arr.length];
            copy(arr,newArray);
            arr=newArray;
            arr[++top]=a;
            return;
        }
        else
        {
            arr[++top]=a;
        }
    }
    public void copy(int[] oldArr,int []newArr)
    {
        for(int i=0;i<oldArr.length;i++)
        {
            newArr[i]=oldArr[i];
        }
    }
    public int size()
    {
        return ++top;
    }
    public int pop()
    {
        if(top==-1)
        {
            System.out.println("Stack is already empty");
            return 0;
        }
        else{ 
        int temp = arr[top];
        --top;
        return arr[top];
        }
    }
    public int peek()
    {
        if(top==-1)
        return 0;
        else
        return arr[top];
    }
    public boolean isEmpty()
    {
        if(top==-1)
        return true;
        else
        return false;
    }
    public String toString()
    {
        StringBuffer obj = new StringBuffer("");
        if(top!=-1)
        {
            for(int i=top;i>=0;i--)
            {
                obj.append(arr[i]+" ");
            }
        }
        return obj.toString();
    }
    public static void main(String args[])
    {
        Stack obj = new Stack();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        obj.push(5);
        System.out.println(obj);
        System.out.println("First element using .peck(): "+obj.peek());
        obj.pop();
        System.out.println("########### AFTER POPPING THE FIRST ELEMENT ##############");
        System.out.println(obj);
    }
}