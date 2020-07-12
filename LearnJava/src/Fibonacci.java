public class Fibonacci
{
	public static void main(String A[])
		{
			int p=0,p1=1,fibo=0;
			System.out.print(p+"\t");
			
				for (int i=0;i<=10;i++)
				{
					fibo=p+p1;
					System.out.print(fibo+"\t");
					p1=p;
					p=fibo;

				}

		}


}