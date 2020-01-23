public class TwoPoints180
{
    public void solve(int x,int y,int x1,int y2)
    {
        int temp=y2-y;
        int newY=y2+temp;
        System.out.println("New Coordinates: "+"X: "+x+" , y: "+newY);
    }
    public static void main(String args[])
    {
        new TwoPoints180().solve(0,1,0,4);
    }
}