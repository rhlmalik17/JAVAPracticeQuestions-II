public class MagicNumber
{
    public static int getMagicNumber(int num,int n)
    {
        int result=0;
        for(int i=0;i<32;i++)
        {
            if((n & (1 << i))>0)
            {
                result+= Math.pow(num,(i+1));
            }
        }
        return result;
    }
    public static void main(String args[])
    {
        System.out.println(getMagicNumber(5,10));
    }
}