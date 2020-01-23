public class Operations
{
    int count;
    public void checkSteps(int n)
    {
        count=n;
        traverse(n,0); 
        System.out.println(count);
    }
    public void traverse(int n,int num)
    {
        if(n==1)
        {
            if(num<count)
            count=num;

            return;
        }
        traverse(n-1,num+1);
        if(n%2==0)
        {
            traverse(n/2,num+1);
        }
        if(n%3==0)
        {
            traverse(n/3,num+1);
        }
    }
    public static void main(String args[]) {
        new Operations().checkSteps(10);
    }
}