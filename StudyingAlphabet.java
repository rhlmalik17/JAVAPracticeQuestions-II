import java.util.*;

public class StudyingAlphabet
{
    public static Scanner taker = new Scanner(System.in);
    public void solve(String words,String input)
    {
        for(int i=0;i<input.length();i++)
        {
            String temp = input.charAt(i)+"";
            if(!words.contains(temp))
            {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
    public static void main(String args[])
    {
        String letters = taker.nextLine();
        int words = taker.nextInt();
        taker.nextLine();
        while(words-- >0)
        {
            new StudyingAlphabet().solve(letters,taker.nextLine());
        }
    }
}