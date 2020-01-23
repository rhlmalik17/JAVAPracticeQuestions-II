import java.util.*;
public class N_Queen
{
    int  board[][];
    int count=0;
    public void solve(int n)
    {
        board=new int[n][n];
        traverse(0,0,n);
        System.out.println(count);
    }
    public void display(int arr[][])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public void traverse(int x,int y,int queens)
    {
        if(x>=board.length || y>=board[0].length || queens==0)
        {
            if(queens==0)
            {
                display(board);
                count++;
                return;
            }
          return;
        }
        for(int i=0;i<board[0].length;i++)
        {
            if(isSafe(x, i))
            {
                board[x][i]=1;
                traverse(x+1,0,queens-1);
                board[x][i]=0;
            }
        }
        
    }
    public boolean isSafe(int x,int y)
    {
        for(int i=0;i<board.length;i++)
        {
            if(board[x][i]==1)
            return false;
        }
        for(int i=0;i<board.length;i++)
        {
            if(board[i][y]==1)
            return false;
        }
        int tempX=x,tempY=y;
        while(tempY>=0 && tempX>=0)
        {
            if(board[tempX][tempY]==1)
            {
                return false;
            }
            tempY--;
            tempX--;
        }
        tempX=x;
        tempY=y;
        while(tempX<=board.length-1 && tempY<=board.length-1) 
        {
            if(board[tempX][tempY]==1)
            {
                return false;
            }
            tempY++;
            tempX++;
        }
        tempX=x;
        tempY=y;
        while(tempX>=0 && tempY<=board.length-1) 
        {
            
            if(board[tempX][tempY]==1)
            {
                return false;
            }
            tempY++;
            tempX--;
        }
        tempX=x;
        tempY=y;
        while(tempX<=board.length-1 && tempY>=0) 
        {
            if(board[tempX][tempY]==1)
            {
                return false;
            }
            tempY--;
            tempX++;
        }
        return true;
    }
    public static void main(String args[])
    {
        new N_Queen().solve(4);
    }
}
