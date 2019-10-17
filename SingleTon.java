class SingleTonDemo
{
    private static SingleTonDemo object;
    private SingleTonDemo()
    {
        System.out.println("Object Created.");
    }
    public static SingleTonDemo getInstance()
    {
        if(object==null)
        object = new SingleTonDemo();

        return object;
    }
}
public class SingleTon
{
    public static void main(String args[])
    {
       SingleTonDemo obj= SingleTonDemo.getInstance();
       SingleTonDemo obj1= SingleTonDemo.getInstance();
       if(obj==obj1)
       System.out.println("True");
    }
}