public class WaterUnits
{
    public static void calculateUnits(int arr[])
    {
       int units=0,temp=0;
       int iterator=0,a=iterator+1;
          
      while(a<arr.length)
      {
          if(arr[iterator]>arr[a] && a<arr.length)
          { 
           
            while(arr[a]<arr[iterator] && a<arr.length && iterator<a)
            {

                temp+=arr[iterator]-arr[a];
                a++;
                if(a==arr.length)
                {
                    break;
                }
            }
            if(a==arr.length)
            {
                temp=0;
                break;
            }
            else
            {
                units+=temp;
                temp=0;
            }
            
           
            
                iterator=a;
                a=iterator+1;
            
            
          }
          else
          {
             
              iterator++;
              a=iterator+1;
              
          }
         
      }
      System.out.println(units);
    }
    public static void main(String args[])
    {
        int arr[]={0,2,1,3,5,7,6,4,2};
        calculateUnits(arr);
    }
}