// To find second smallest number in an Array

class Secondsmall {
    public static void main(String[] args) {
        
       int arr[]={2,55,8,7,10,15,99,2828};
       int min=arr[0];
       for(int i=0;i<arr.length;i++)
       {
           if(arr[i]<min)
           {
               min=arr[i];
           }
       }
	   
       int secondmin=Integer.MAX_VALUE;
       for(int i=0;i<arr.length;i++)
       {
         if(arr[i]>min && arr[i]<secondmin)
          {
              secondmin=arr[i];
          }
       }
	   
       System.out.println(secondmin);
    }
}