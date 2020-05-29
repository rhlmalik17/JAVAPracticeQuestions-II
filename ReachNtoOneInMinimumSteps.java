/*
    REACH FROM N to 1 in minimum steps by performing 3 following operations:-
    1. n = n-1;
    2. n = n/2; //ONLY IF n%2==0;
    3. n = n/3; //ONLY IF n%3==0;
*/

public class ReachNtoOneInMinimumSteps
{
    int count = Integer.MAX_VALUE;
    public void solve(int n)
    {
        traverse(n,0);
        System.out.println(count);
    }
    public void traverse(int n,int moves)
    {
        if(n<=0 || moves>count)
        return;

        if(n==1)
        {
            if(count>moves)
            count=moves;

            return;
        }

        traverse(n-1,moves+1);
        if(n%2==0)
        traverse(n/2,moves+1);
        if(n%3==0)
        traverse(n/3,moves+1);
    }
    public static void main(String args[]) {
        new ReachNtoOneInMinimumSteps().solve(10000);
    }
}