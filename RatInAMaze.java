public class RatInAMaze
{
    int maze[][];
    boolean result=false;
    public void solve(int arr[][])
    {
        maze=arr;
        traverse(0,0);
    }
    public void traverse(int x,int y)
    {
        if(x>=maze.length || y>=maze[0].length || maze[x][y]==1 || result)
        {
            return;
        }
        if(x==(maze.length-1) && y==(maze[0].length-1))
        {
            maze[x][y]=5;
            result=true;
            return;
        }
        maze[x][y]=5;
        traverse(x+1,y);
        traverse(x,y+1);

    }
    public void Display()
    {
        for(int i=0;i<maze.length;i++)
        {
            for(int j=0;j<maze[0].length;j++)
            {
                System.out.printf(maze[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        int arr[][]={{0,0,1,1,1},
                     {0,0,0,0,0},
                     {1,0,1,1,1},
                     {0,0,0,0,0}};
       RatInAMaze obj =  new RatInAMaze();
       obj.solve(arr);
       obj.Display();

    }
}