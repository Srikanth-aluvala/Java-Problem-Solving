import java.util.Scanner;
class Great
{
	public static void main(String [] args)
	{
		Scanner obj= new Scanner(System.in);
	        System.out.print("enter number ");
	        int num=obj.nextInt();
		if (num==0)
		{
			System.out.println("it is zero");
		}
	      else if(num>0)
		{ 
	    System.out.print("positive number");
		}
	else
	{
		System.out.println("negative number");
	   		 
	}
  }
}