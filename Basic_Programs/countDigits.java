class countDigits
 {
    public static void main(String[] args) 
	{
   int num=5821;
   int count=0;
   while(num>0)
   {
       int rem=num%10;
       count++;
       num=num/10;
   }
   System.out.println("count :"+count);
    }
}