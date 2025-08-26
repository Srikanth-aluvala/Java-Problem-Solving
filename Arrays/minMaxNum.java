
class minMaxNum 
{
    public static void main(String[] args)
	{
     int arr[]={20,40,2,67,98,35};
     int larg=arr[0];
     int small=arr[0];
     
	 for(int i=0;i<arr.length;i++)
     {
           if(arr[i]>larg)
            {
             larg=arr[i];
             }
             if(arr[i]<small)
             {
                 small=arr[i];
             }
          }
     
       System.out.println(larg+" is largest number");
       System.out.println(small+" is Smallest number");
       
    }
   }