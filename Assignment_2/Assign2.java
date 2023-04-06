import java.util.Scanner;
class BodyMassIndex
{
double weight;
double height;

BodyMassIndex()
{
     this.weight = 60.00;
    this.height = 1.60;
    
}
void setweight(double weight)
{
this.weight = weight;
}

void setheight(double height)
{
    this.height = height;
}

double getweight()
{
    return this.weight;
}

double getheight()
{
    return this.height;
}

double calculatebmi()
{
     double bmi = weight / (height * height);
    return bmi;
}
}

class Assign2
{

    public static void main(String args[])
    {
    BodyMassIndex b1 = new BodyMassIndex();
    Scanner sc = new Scanner(System.in);
    System.out.println("enter your weight and height");
   b1.setweight( sc.nextDouble());
   b1.setheight(sc.nextDouble());
   System.out.println("weight is "+b1.getweight()+"and height os :"+b1.getheight());
    double bmi = b1.calculatebmi();
    System.out.println("bmi of your is : "+bmi);
    }
}



