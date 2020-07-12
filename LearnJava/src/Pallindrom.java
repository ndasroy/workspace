import java.util.Scanner;
public class Pallindrom 
{
	public static void main(String A[])
	{
	Scanner  s = new Scanner(System.in);
	System.out.println("Please enter the String");
	String Str = s.next();
	
	char[] cArray = Str.toCharArray();
	System.out.println(cArray);
	int cLength= cArray.length-1;
	int flag=0;
	 for(int i=0;i<cArray.length;i++)
	  {
		 if(cArray[i]!=cArray[cLength-i])
			 {
				 flag=1;
			 }
		 
	  }
	 if(flag==0)
		 {
			 System.out.println("String is Palindrome");
		 }
	 else
		 {
			 System.out.println("String is not Palindrome");
		 }
	
	}
}
