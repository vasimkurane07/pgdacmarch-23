import java.util.Scanner;
 class Assign26
{
    public static void main(String a[])
{
    System.out.println("enter the two no");
    Scanner sc=new Scanner(System.in);
    float x=sc.nextFloat();
    float y=sc.nextFloat();
    float z=x>y?x:y;
    System.out.println("the greater no is : "+z);
    float sum=Float.sum(x,y);
    System.out.println("ADDITION IS : "+sum);


}
}