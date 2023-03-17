import java.util.Scanner;
public class Digit
{
public static void main(String args[])
{
int n,x,sum=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter the no");
n=sc.nextInt();
while(n!=0)
{
x=n%10;
sum=sum+x;
n=n/10;
}
System.out.println(sum);
}
}