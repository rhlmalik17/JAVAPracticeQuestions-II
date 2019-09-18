import java.util.Scanner;

public class SpiralArray
{
    public static Scanner taker = new Scanner(System.in);
    public static void getArrayElements(int arr[][],int m,int n)
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=taker.nextInt();
            }
        }
    }
    public static void main(String args[]) {
        int m=taker.nextInt();
        int n=taker.nextInt();
        int arr[][] = new int[m][n];
        getArrayElements(arr, m, n);
        System.out.println("###################");
         spiralPrint(m,n,arr);
        
    }
    public static void spiralPrint(int rows, int cols, int arr[][]) 
    {
        int count=0;
        int c1=0;
        int a=0;
        int total = rows*cols;
        int r1=1;
        int b=2;
        int c2=0;
        int c=2;
        int d=0;
        int e=1;
        while(count!=total)
        {
            for(int i=c1;i<cols-a;i++)
            {
                if(count>=total)
                {
                    break;
                }
                System.out.printf(arr[c1][i]+" ");
                count++;
                c2++;
            }
            --c2;
            for(int i=r1;i<=rows-e;i++)
            {
                if(count>=total)
                {
                    break;
                }
                System.out.printf(arr[i][rows-e]+" ");
                count++;
            }
            for(int i=cols-b;i>=0;--i)
            {
                if(count>=total)
                {
                    break;
                }
                System.out.printf(arr[c2][i]+" ");
                count++;
            }
            for(int i=rows-c;i>0;--i)
            {
                if(count>=total)
                {
                    break;
                }
                System.out.printf(arr[i][d]+" ");
                count++;
            }
            a++;
            c1++;
        }
        
    }

// static void spiralPrint(int m, int n, int a[][]) 
// { 
//   int i, s = 0, j = 0; 
//   /* s - starting row index 
//   m - ending row index 
//   j - starting column index 
//   n - ending column index 
//   i - iterator 
//   */

//   while (s < m && j < n) { 
//     // Print the first row from the remaining rows 
//     for (i = j; i < n; ++i) { 
//       System.out.print(a[s][i] + " "); 
//     } 
//     s++; 

//     // Print the last column from the remaining columns 
//     for (i = s; i < m; ++i) { 
//       System.out.print(a[i][n - 1] + " "); 
//     } 
//     n--; 

//     // Print the last row from the remaining rows */ 
//     if (s < m) { 
//       for (i = n - 1; i >= j; --i) { 
//         System.out.print(a[m - 1][i] + " "); 
//       } 
//       m--; 
//     } 

//     // Print the first column from the remaining columns */ 
//     if (j < n) { 
//       for (i = m - 1; i >= s; --i) { 
//         System.out.print(a[i][j] + " "); 
//       } 
//       j++; 
//     } 
//   } 
// }

}