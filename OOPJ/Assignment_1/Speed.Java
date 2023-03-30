import java.util.Scanner;
class Speed
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int dist=sc.nextInt();
        int hrs= sc.nextInt();
        int min= sc.nextInt();
        int sec= sc.nextInt();

        float time =hrs*3600+min*60+sec;
        System.out.println("time :" +time);

float speed=(dist*3600)/(time*1000);
System.out.println("kilometer :"+time);

float speed1=dist/time;
 System.out.println("METER :"+speed);

 double speed2=(dist*3600)/(time*1000*1.609);
  System.out.println("milesperhour :"+speed);

    }
}