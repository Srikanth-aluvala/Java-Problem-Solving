// To Finding count of Even and Odd Indexs in an Array from user 

import java.util.Scanner;
class EvenOddIndex
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Size:");
		int len=sc.nextInt();
     	System.out.println("Enter Array Elements:");
		int arr[]=new int[len];
		
		int evencount=0;
		int oddcount=0;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			
			if(i%2==0)
			{
				evencount++;
			}
			else
			{
				oddcount++;
			}
		}
			System.out.println("EVEN index Count:"+evencount);
			System.out.println("ODD index Count:"+ oddcount);
	}
}