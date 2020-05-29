public class KMPAlgo
{
    public void solve(String input,String pattern)
    {
      int arr[][]=new int[input.length()][pattern.length()];
      for(int i=0;i<input.length();i++)
      {
          for(int j=0;j<pattern.length();j++)
          {
            if(input.charAt(i)==pattern.charAt(j))
            {
                arr[i][j]=1;
            }
          }
      }
      display(arr);
      checkForStarting(arr);
    }
    public void checkForStarting(int arr[][])
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[0][i]==1)
            {
                if(ifAllOnes(arr, i))
                {
                    System.out.println("True");
                    return;
                }
            }
        }
        System.out.println("False");
    }
    public boolean ifAllOnes(int arr[][],int index)
    {
        for(int i=0;i<arr[0].length;i++)
        {
            if(arr[i][index]==0)
            {
                return false;
            }
            index++;
        }
        return true;
    }
    public void display(int arr[][])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        String tc = "aabcdaabc";
        String pattern = "aabc";
        new KMPAlgo().solve(pattern,tc);
    }
}