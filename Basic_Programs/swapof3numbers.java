class swapof3numbers
{
	public static void main(String [] args)
	{
	int a=10;
	int b=20;
	int c=30;
	System.out.println("before swaping");
	System.out.println("a:"+a);
	System.out.println("b:"+b);
	System.out.println("c:"+c);
	System.out.println("after swaping");
	
	c=a+b+c; // 60
	a=c-(a+b); // 60-(10+20)=30
	b=c-(a+b); // 60-(30+20)=10
	c=c-(a+b); // 60-(30+10)=20
	
	System.out.println("a:"+a); // 30
	System.out.println("b:"+b); // 10
	System.out.println("c:"+c); // 20
	}
}