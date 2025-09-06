
class Secondlarg 
{
    public static void main(String[] args) 
	{
     int arr[]={1,3,5,2,2};
     int first=arr[0];
     
     for(int i=0;i<arr.length;i++)
     {
         if(arr[i]>first)
         {
             first=arr[i];
         }
     }
     int second=Integer.MIN_VALUE;
     for(int j=0;j<arr.length;j++)
     {
         if(arr[j]>second && arr[j]<first)
         {
             second=arr[j];
         }
     }
     System.out.println(second);
    }
}