public class MaxRectangleInBinaryMatrix
{
    public void solve(int arr[][])
    {
        
    }
    public static void main(String args[])
    {
        int arr[][]={   { 1, 1, 1, 1}
                       ,{ 1, 1, 0, 1}
                       ,{ 0, 0, 0, 1}
                       ,{ 0, 0, 1, 0}
                       ,{ 1, 0, 1, 0}
                    };
                       new MaxRectangleInBinaryMatrix().solve(arr);
    }
}
    // boolean isOkay=false;
    // int matrix[][],area=Integer.MIN_VALUE;
    // public void solve(int arr[][])
    // {
    //     matrix=arr;
    //     for(int i=0;i<matrix.length;i++)
    //     {
    //         for(int j=0;j<matrix[0].length;j++)
    //         {
    //             traverse(i,j);
    //         }
    //     }
    //     System.out.println(area);
    // }
    // public void traverse(int x,int y)
    // {
    //     if(matrix[x][y]==0)
    //     {
    //         return;
    //     }
    //     int length=0,breadth=0;
    //     for(int i=y+1;i<matrix[0].length;i++)
    //     {
    //         if(matrix[x][i]==1)
    //         {
    //             length++;
    //         }else
    //         {
    //             break;
    //         }
    //     }
    //     for(int i=x+1;i<matrix.length;i++)
    //     {
    //         if(matrix[i][y]==1)
    //         {
    //             breadth++;
    //         }else
    //         {
    //             break;
    //         }
    //     }
    //     isOkay=true;
    //     checkOnes(x,y,(x+breadth),(y+length));
    //     if(isOkay)
    //     {
    //         int temp = (length+1)*(breadth+1);
    //         if(temp>area)
    //         {
    //             area=temp;
    //         }
    //         else
    //         {
    //             return;
    //         }
    //     }
    // }
    // public void checkOnes(int x,int y,int x2,int y2){
    //     if((x==x2 && y==y2) || x>x2 || y>y2 )
    //     {
    //         return;
    //     }
    //     if(!isOkay)
    //     {
    //         return;
    //     }
    //     if(matrix[x][y]==0)
    //     {
    //         isOkay=false;
    //         return;
    //     }
    //     checkOnes(x, y+1, x2, y2);
    //     checkOnes(x+1, y, x2, y2);
    // }       