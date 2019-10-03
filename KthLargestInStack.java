import java.util.Comparator;
import java.util.Stack;
import java.util.Arrays;
public class KthLargestInStack 
{

    public static void sortStack(Stack<Integer> stack)
    {
        Integer arr[] = new Integer[stack.size()];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=stack.pop();
        }
        Arrays.sort(arr,new Comparator<Integer>(){
            @Override
            public int compare(Integer A,Integer B)
            {
                if(A<B)
                return -1;
                else if(A>B)
                return 1;
                else
                return 0;
            }
        });
        for(int i=0;i<arr.length;i++)
        {
            stack.push(arr[i]);
        }
    }


    public static int getKthLargest(Stack<Integer> stack,int k)
    {
        sortStack(stack);
        for(int i=0;i<k-1;i++)
        {
            stack.pop();
        }
        return stack.peek();
    }

    public static void main(String args[])
    {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(6);
        stack.push(7);
        stack.push(9);
        stack.push(5);
        stack.push(10);
        System.out.println(getKthLargest(stack,2));

    }
}