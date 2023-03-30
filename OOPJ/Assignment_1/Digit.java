import java.util.Scanner;
class Digit
{
    public static void main(String args[])
    {
        int i;
        int sum=0;
        int digit;
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int num=sc.nextInt();
while(num>0)
{
digit=num%10;
sum=sum+digit;
num=num/10;
}
System.out.println("sum of digit :"+sum);

    }
}