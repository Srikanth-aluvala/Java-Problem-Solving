import java.util.Scanner;
public class Averagenumbers
{
public static void main(String [] args)
{
Scanner input=new Scanner(System.in);
System.out.println("Enter 5 numbers :");

int num1=input.nextInt();
int num2=input.nextInt();
int num3=input.nextInt();
int num4=input.nextInt();
int num5=input.nextInt();

int sum=num1+num2+num3+num4+num5;
double Avg=sum/5.0;
System.out.println("Average:"+Avg);
}
}
