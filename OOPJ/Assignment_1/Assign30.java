import java.util.Scanner;
 class Assign30
{
    public static void main(String a[])
{
    System.out.println("enter the two no");
    Scanner sc=new Scanner(System.in);
    double x=sc.nextDouble();
    double y=sc.nextDouble();
    double z=x>y?x:y;
    System.out.println("the greater no is : "+z);
    double sum=Double.sum(x,y);
    System.out.println("ADDITION IS : "+sum);


}
}