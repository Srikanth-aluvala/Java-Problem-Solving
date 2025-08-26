
class PerfectNum {
    public static void main(String[] args) {
        int num=6;
        int temp=num;
        int sum=0;
        
        for(int i=1;i<=num / 2;i++)
        {
           if(num%i==0)
           {
             sum+=i;
           }
        }
        
        if(temp==sum)
        {
         System.out.println(num+" is perfect Number");   
        }
      else
      {
          System.out.println(num+" Not a Perfect number");
      }
    }
}