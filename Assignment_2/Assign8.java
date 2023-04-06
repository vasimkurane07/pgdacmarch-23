import java.util.Scanner;
class Rational
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        int deno1;
        int deno2;
        int ans2;
        int num_reduced1;
        int deno_reduced1;
        int num_reduced2;
        int deno_reduced2;
         int x;
        int ans_num;
        int ans_deno;
        int y;
        int ans_num1;
        int ans_deno1;
        System.out.println("enter the 1st rational no");
         System.out.println("enter the numerator");
         num1 = sc.nextInt();
         System.out.println("enter the denominator");
         deno1 = sc.nextInt();
         System.out.println("enter the 2nd rational no");
          System.out.println("enter the numerator");
         num2 = sc.nextInt();
         System.out.println("enter the denominator");
         deno2 = sc.nextInt();
         if((deno1%deno2==0)||(deno2%deno1==0))
         {
            if(deno1<deno2)
            {
                 x = deno2/deno1;
                 ans_num = ((num1*x)+num2);
                 ans_deno=deno2;
                System.out.println("ADDITION IS numerator =  "+ans_num+"denominator"+ans_deno);
                while((ans_num%2==0)&&(ans_deno%2==0))
                {
                     ans_num = ans_num/2;
                     ans_deno = ans_deno/2; 
                }
                System.out.println("REDUCED :"+ans_num+"/"+ans_deno);
            }
                else
                {
                   y= deno1/deno2;
                 ans_num1= (num1+(num2*y));
                 ans_deno1=deno2;
                 System.out.println("ADDITION IS numerator =  "+ans_num1+"denominator"+ans_deno1);
                  while((ans_num1%2==0)&&(ans_deno1%2==0))
                {
                     ans_num1 = ans_num1/2;
                     ans_deno1 = ans_deno1/2; 
                }
                System.out.println("REDUCED :"+ans_num1+"/"+ans_deno1);
                }
            
          
         }
           else
           {
             ans2=((num1*deno2)+(num2*deno1))/deno1*deno2;
            System.out.println("ADDITION IS : "+ans2);
           }
    }
}