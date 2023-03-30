import java.util.Scanner;
 class Assign18
{
    public static void main(String a[])
{
    System.out.println("enter the two no");
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    int y=sc.nextInt();
    int z=x>y?x:y;
    System.out.println("the greater no is : "+z);
    int sum=Integer.sum(x,y);
    System.out.println("ADDITION IS : "+sum);


}
}