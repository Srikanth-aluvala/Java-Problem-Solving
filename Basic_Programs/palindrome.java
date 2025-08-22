//  to check  A number is Palindrome or not

class palindrome
{
    public static void main(String [] args)
    {
        int num=1331;
        int temp=num;
        int sum=0;
while(num>0)
{
    int rem=num%10;
    sum=sum*10+rem;
    num=num/10;
}
if(sum==temp)
{
    System.out.println("it is a palindrome");
}
else
{
    System.out.println("not a palindrome");
}
    }
}