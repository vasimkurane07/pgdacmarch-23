import java.util.Scanner;
public class Lcm
{
public  static void main(String args[])
{
int lcm,x,y;
Scanner sc=new Scanner(System.in);
System.out.println("enter the two no");
x=sc.nextInt();
y=sc.nextInt();
lcm=(x>y)?x:y;
while(lcm!=x*y)
{
if((lcm%x==0)&&(lcm%y==0))
break;
else
lcm++;
}
System.out.println(lcm);
}
}