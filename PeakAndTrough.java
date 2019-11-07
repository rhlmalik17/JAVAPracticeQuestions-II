public class PeakAndTrough
{
    int peaks=0,troughs=0;
    public boolean isPeak(int left,int middle,int right,int arr[])
    {
        if(left==-1 && arr[middle]>arr[right])
        {
            return true;
        }
        else if(right==-1 && arr[middle]>arr[left])
        return true;

        else
        {
            if(middle!=-1 && left!=-1 && arr[middle]>arr[left] && arr[middle]>arr[right])
            return true;
        }
        return false;
    }
    
    public boolean isTrough(int left,int middle,int right,int arr[])
    {
        if(left==-1 && arr[middle]<arr[right])
        {
            return true;
        }
        else if(right==-1 && arr[middle]<arr[left])
        return true;

        else
        {
            if(arr[middle]<arr[left] && arr[middle]<arr[right])
            return true;
        }
        return false;
    }
    public void  printPeakAndTrough(int arr[])
    {
        System.out.print("Peaks: ");
        for(int i=0;i<arr.length;i++)
        {
            if(i==0)
            {
                if(isPeak(-1,i,i+1,arr))
                {
                    System.out.print(arr[i]+" ");
                }
            }
            else if(i==arr.length-1)
            {
                if(isPeak(i-1,i,-1,arr))
                {
                    System.out.print(arr[i]+" ");
                }
            }
            else
            {
                if(isPeak(i-1,i,i+1,arr))
                {
                    System.out.print(arr[i]+" ");
                }
            }
        }
        System.out.println();
        System.out.print("Troughs: ");
        for(int i=0;i<arr.length;i++)
        {
            if(i==0)
            {
                if(isTrough(-1, i , i+1, arr))
                {
                    System.out.print(arr[i]+" ");
                }
            }
            else if(i==arr.length-1)
            {
                if(isTrough(i-1, i , -1, arr))
                {
                    System.out.print(arr[i]+" ");
                }
            }
            else
            {
                if(isTrough(i-1, i , i+1, arr))
                {
                    System.out.print(arr[i]+" ");
                }
            }
        }
    }
    public static void main(String args[])
    {
        PeakAndTrough obj = new PeakAndTrough();
        int arr[] = {5,10,6,3,2,9};
        obj.printPeakAndTrough(arr);
    }
}