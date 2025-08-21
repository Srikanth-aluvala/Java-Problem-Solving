class fibonacciSeries 
{
    public static void main(String[] args) 
	{
        int prev=0;
        int curr=1;
        int num =10;
        int next=0;
        System.out.print(prev+ "," +curr+",");
        for(int i=2;i<num;i++)
		{
            next=prev+curr;
            prev=curr;
            curr=next;
            System.out.print(next+",");
       }
    }
}
