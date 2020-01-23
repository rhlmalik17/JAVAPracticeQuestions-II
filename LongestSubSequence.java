public class LongestSubSequence
{
    int length=Integer.MIN_VALUE;
    int arr[][];
    public int LCS(String input1,String input2)
    {
        arr=new int[input2.length()][input1.length()];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                int max=arr[i][j];
                if(i>0 &&  arr[i-1][j]>max)
                {
                   max=arr[i-1][j];
                }
                if(j>0 &&  arr[i][j-1]>max)
                {
                   max=arr[i][j-1];
                }
                arr[i][j]=max;
                if(input2.charAt(i)==input1.charAt(j))
                {
                    arr[i][j]++;
                    max=arr[i][j];
                }

                if(length<max)
                {
                    System.out.print(input2.charAt(i));
                    length=max;
                }
            }
        }
        return length;
    }
    public static void main(String args[])
    {
       new LongestSubSequence().LCS("amxnvpolk", "mnxzoplk");
        System.out.println();
    }
}