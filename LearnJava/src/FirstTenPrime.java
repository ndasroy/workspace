public class FirstTenPrime
{
  public static void main(String args[])
  {

	   // int flag=0;		// If we declare outside the loop,need to reset.
		    
	    for(int j=2;j<10;j++)
			    {
	    			int flag=0;
	    			for(int i=2;i<j;i++)
			
				       { 
							if(j%i==0)
						      {
								flag=1;
						      }
				       }
				       
			       if(flag==0)
					    {
					    	System.out.print("\t"+j);
					        
					    }
			       //flag=0;		// Need to reset flag to 0.
			    }
  	}
}