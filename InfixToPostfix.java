import java.lang.*;
import java.io.*;
import java.util.*;

class InfixToPostfix {
	public static void main (String[] args) {
		//code

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n--!=0)
		{
		    Stack <Character> obj=new Stack<>();
		    String str=sc.next();
		    String ans="";
		    for(int i=0;i<str.length();i++){
		        char c=str.charAt(i);
		        if(Character.isLetterOrDigit(c))
		        ans=ans+c;
		        else if(c=='(')
		        obj.push(c);
		        else if(c==')')
		        {
		            while(!obj.isEmpty()&&obj.peek()!='(')
		            ans=ans+obj.pop();
		            obj.pop();
		        }
		        else
		        {
		            while(!obj.isEmpty()&&prec(c)<=prec(obj.peek()))
		            ans=ans+obj.pop();
		            obj.push(c);
		        }
		    }
		            while(!obj.isEmpty())  
		            ans=ans+obj.pop();
		            System.out.println(ans);		
		        
        	}
		}
			 static int prec(char c){
		        switch(c)
		        {
		            case '+':
		            case '-':return 1;
		            case '/':
		            case '*':return 2;
		            case '^':return 3;
		            case '(':return -1;
		        }
		        return 0;
		    }
	}