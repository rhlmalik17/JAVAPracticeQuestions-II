public class FirstOccurance
{
    public static void binarySearch(int arr[],int input)
    {
        int mid=arr.length/2;
        int s=0;
        int e=arr.length-1;

        while(s<=e)
        {
            if(arr[mid]==input)
            {
                //     if(mid!=0){ 
                //     while(arr[mid]!=input)
                //     {
                //         if(mid==0)
                //         break;
                //         else
                //         --mid;
                //     }
                //     System.out.println("index: "+mid);
                //     break;
                // }
                
                if(mid==0)
                System.out.println("index: "+mid);

                else
                {
                    
                    if(arr[mid]==arr[mid-1]){
                        System.out.println("TRUE");
                    while(arr[mid]==input && mid>0)
                    {
                        mid--;
                    }
                     }
                    System.out.println("index: "+mid);
                    break;
                }


              
            }
            else if(arr[mid]>input)
            {
                //Go left
                e=mid;
                mid=(s+e)/2;
            
            }
            else if(arr[mid]<input)
            {
                //Go right
                
                s=mid;
                // System.out.println("Start: "+s);
                // System.out.println("end: "+e);
                mid=(s+e)/2;
                // System.out.println(mid);
            }
        }
        
    }
    public static void main(String args[])
    {
        int arr[]={1,1,12,13,13,14,14,23,23};
        binarySearch(arr, 23);
    }
}