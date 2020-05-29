import java.util.*;

public class Source {
   public static void main(String args[]) {
       Scanner s = new Scanner(System.in);
       String str = s.nextLine();
       reverseTheString(str);
   }

   // Method to reverse the string without affecting the special characters
   static void reverseTheString(String str) {
       // Write your code here
       char arr[] = str.toCharArray();
       int i = 0,j = arr.length-1;

       while(i<j){
        if(!Character.isAlphabetic(arr[i]))
        {
            i++;
            continue;
        }

        if(!Character.isAlphabetic(arr[j]))
        {
            j--;
            continue;
        }
        swap(i, j, arr);
        i++;
        j--;
       }
       for(char e : arr)
       System.out.print(e);
   }
   public static void swap(int i,int j,char arr[]){
       char temp = arr[i];
       arr[i] = arr[j];
       arr[j] = temp;
   }
}