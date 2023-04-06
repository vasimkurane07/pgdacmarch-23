import java.util.Scanner;
class Vehicle
{
int axle;
double distance;
String type ;
 double totalfee;
double totalamountdue;
 Scanner sc = new Scanner(System.in);

void calculateTollFee()
    {
        if(this.type == "truck")
    {

        double x = 0.50*this.axle;
         totalfee = x*this.distance;
           System.out.println("toll fee : "+totalfee);
    }
    else
    {
     double x = 0.25*this.axle;
         totalfee = x*this.distance;
        System.out.println("toll fee : "+totalfee);
    }
}

void generateBill()
{
totalamountdue = 2.00 + this.totalfee;
System.out.println("your total bill : "+totalamountdue);
}

void setaxle(int axle)
{
    this.axle = axle;
}
 void settype(String type)
{
    this.type = type;
}
void setdistance(double distance)
{
    this.distance = distance;
}



int showMenu()
{
    System.out.println("1.Enter vehicle type (car, van, bus, or truck");
   
     System.out.println("2. Enter number of axles");
     
    System.out.println("3.Enter distance travelled");
   
      System.out.println(".4. Calculate toll fee");
      
      System.out.println(".5. Generate bill");
      
      System.out.println("6.Exit");

      int y = sc.nextInt();
      return y;
}
}



class Assign7
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);  
      int choice;
       
        Vehicle c1 = new Vehicle();
        do{
         choice=c1.showMenu();
         switch(choice)
         {
            case 1:
                System.out.println("1.Enter vehicle type (car, van, bus, or truck");
                c1.settype(sc.nextLine());
                break;

           
            case 2:
                System.out.println("2. Enter number of axles");
     
                c1.setaxle(sc.nextInt());
                break;

            case 3:
                System.out.println("3.Enter distance travelled");
                c1.setdistance(sc.nextDouble());
                break;

            case 4:
                // System.out.println(".4. Calculate toll fee");
                    c1.calculateTollFee();
                    break;

            case 5:
                c1.generateBill();
                break;

            
                
         }
        } while(choice!=6);
         
       
    }
}
