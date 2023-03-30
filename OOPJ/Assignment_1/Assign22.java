import java.util.Scanner;
 class Assign22
{
    public static void main(String a[])
{
    System.out.println("enter the two no");
    Scanner sc=new Scanner(System.in);
    long x=sc.nextLong();
    long y=sc.nextLong();
    long z=x>y?x:y;
    System.out.println("the greater no is : "+z);
    Long sum=Long.sum(x,y);
    System.out.println("ADDITION IS : "+sum);


}
}