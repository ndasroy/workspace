package Old_Programmes;

class Light
{
	public static void main(String args[])
	{
		int lightspeed = 186000;
		long days = 1000;
		long seconds = days * 24 * 60 * 60;
		long distance = lightspeed * seconds;
		
		System.out.println("In "+ days + " Light Will Travel the Distance :" +distance);
		
		
	}
}