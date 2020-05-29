import java.util.Scanner;

public class RamSteps
{
    public int count = 0;
    public void solve(int n,int k)
    {
        traverse(n,k,0,1);
        System.out.println(count);
    }
    public void traverse(int num,int bad,int step,int incr)
    {
        if(num<0 || step==bad)
        {
            return;
        }
        if(step>bad)
        {
            if(step>count)
            count=step;

            return;
        }
        traverse(num-1, bad, step, incr+1);
        traverse(num-1, bad, step+incr, incr+1);
    }
    public static Scanner taker = new Scanner(System.in);
    public static void main(String args[])
    {
        int n = taker.nextInt();
        int k = taker.nextInt();
        new RamSteps().solve(n,k);
    }

}