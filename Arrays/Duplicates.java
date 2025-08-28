class Duplicates
{
public static void main(String [] args)
{
	int arr[]={2,3,4,6,7,2,3,20};
	for(int i=0;i<arr.length;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]==arr[j])
			{
				System.out.println(arr[i]);
			}
		}
	}
}
}