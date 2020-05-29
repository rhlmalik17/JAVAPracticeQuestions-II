/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

public class KnightProblem {
    
    public static Scanner taker = new Scanner(System.in);
    class cell{
        int x,y,dist;
        public cell(int x,int y,int dist)
        {
            this.x=x;
            this.y=y;
            this.dist=dist;
        }
    }
    public void initialise(boolean arr[][])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                arr[i][j]=false;
            }
        }
    }
    public boolean isInside(int x,int y,int size)
    {
        if(x>=0 && y>=0 && x<size && y<size)
        return true;
        
        return false;
    }
    public int solve(int posX,int posY,int targetX,int targetY,int size)
    {
        boolean visited[][]=new boolean[size][size];
        
        int dx[]={ -2, -1, 1 ,2,2 ,1,-1,-2};
        int dy[]={ -1, -2, -2,-1,1,2,2,1};
        
        Queue<cell> q = new LinkedList<cell>();
        
        initialise(visited);
        visited[posX][posY]=true;
        q.add(new cell(posX,posY,0));
        
        while(!q.isEmpty())
        {
            cell temp = q.remove();
            
            if(temp.x==targetX && temp.y==targetY)
            return temp.dist;
            
            
            for(int i=0;i<8;i++)
            {
                int x1 = temp.x + dx[i];
                int y1 = temp.y + dy[i];
                
                if(isInside(x1,y1,size) && !visited[x1][y1])
                {
                    q.add(new cell(x1,y1,temp.dist+1));
                    visited[x1][y1]=true;
                }
            }
            
        }
        return Integer.MAX_VALUE;
    }
    public void display(int arr[][])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.printf(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        
    }

    // public void traverse(int x,int y,int targetX,int targetY,int moves)
    // {
    //      if(x==targetX && y==targetY)
    //     {
    //         // System.out.println(moves);
    //       if(count>moves)
    //       {
    //           count=moves;
    //       }
    //       return;
    //     }
       
    //     if(x>=board.length || y>=board[0].length || x<0 || y<0 || board[x][y]==1)
    //     {
    //         return;
    //     }
        
    //     board[x][y]=1;
    //    
    //     
    //         traverse(x+2,y+1,targetX,targetY,moves+1);
    //         traverse(x+1,y+2,targetX,targetY,moves+1);
    //     
         
    //      
    //          traverse(x+2,y-1,targetX,targetY,moves+1);
    //          traverse(x+1,y-2,targetX,targetY,moves+1);
    //      
         
    //
    //         traverse(x-2,y+1,targetX,targetY,moves+1);
    //         traverse(x-1,y+2,targetX,targetY,moves+1);
    //    
    //         traverse(x-2,y-1,targetX,targetY,moves+1);
    //         traverse(x-1,y-2,targetX,targetY,moves+1);
    //     
    // }
    
	public static void main (String[] args) {
		//code
		int tc = taker.nextInt();
		while(tc-->0)
		{
		    int size = taker.nextInt();
		    int x1 = taker.nextInt();
		    int y1 = taker.nextInt();
		    
		    int xt = taker.nextInt();
		    int yt = taker.nextInt();
		    System.out.println(new KnightProblem().solve(x1-1,y1-1,xt-1,yt-1,size));
		}
	}
}