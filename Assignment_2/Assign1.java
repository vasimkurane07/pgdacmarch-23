import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;
class Assign1 {
 public static void main(String[] args)throws Exception {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the day month and year in format date/month/year");
    String s1= sc.nextLine();
    
    
 String pattern1 = "dd/MM/yyyy";


 SimpleDateFormat sdf1 = new SimpleDateFormat( pattern1);
  


 Date date1 = sdf1.parse( s1 );
  String s2 = new SimpleDateFormat("dd/MM/yyyy").format(date1);
 System.out.println(s2);

 Date date2 = sdf1.parse( s1 );
  String s3 = new SimpleDateFormat("MM/dd/yyyy").format(date2);
 System.out.println(s3);
 //System.out.println("pattern 2 :"+date2);


 Date date3 = sdf1.parse( s1 );
 String s4 = new SimpleDateFormat("yyyy/MM/dd").format(date2);
 System.out.println(s4);
 }
}





























                 