// To Sum of values in an array at index position 0

class sumofValues
{
	public static void main(String [] args)
	{
		String values[]={"34526","575383","76758","64646"};
		String st=values[0];
		int sum=0;
		for(int i=0;i<st.length();i++)
		{
			sum=sum+Character.getNumericValue(st.charAt(i));
		}
		System.out.println("sum of values at index 0:"+sum);
	}
}