import java.util.Scanner;
class Assign33
{
public static void main(String args[])
{

String s=args[0];
String s1=args[0];
String s2=args[0];

System.out.println("enter 1 for integer 2 for float 3 double ");
Scanner sc= new Scanner(System.in);
int choice=sc.nextInt();
switch(choice)
{

case 1:
int x=Integer.parseInt(s);
System.out.println(x);
System.out.println("Addition"+(x+x));
System.out.println("Multiplication"+(x*x));



break;

case 2:
float y=Float.parseFloat(s);
System.out.println(y);
System.out.println("addition : "+(y+y));
System.out.println("MULTIPLICATION" +(y*y));

break;
case 3:
double z=Double.parseDouble(s);
System.out.println(z);

System.out.println("ADDITION :"+" "+(z+z));
System.out.println("MULTIPLICATION"+(z*z));

break;
}
}
}




