import java.util.Scanner;
public class Prime
{
	public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the no");
int x=sc.nextInt();
int y=2;
if(x==1||x==0)
{
System.out.println("it is not prime");
}
while(x%y!=0&&y!=100)
{
if((x%1==0)&&(x%x==0)&&(x%(++y)!=0))
System.out.println("it is a prime");
else
System.out.println("it is not a prime");
}
}
}

