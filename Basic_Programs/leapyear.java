class leapyear
{
	public static void main(String[] args)
	{
		int year=2000;
		if((year%4==0 && year%100!=0) || (year%400==0))
		{
			System.out.println("it is leap yaer");
		}
		else
		{
			System.out.println("not a leap yaer");
		}
	}
}
