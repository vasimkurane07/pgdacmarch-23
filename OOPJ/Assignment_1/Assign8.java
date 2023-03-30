class Assign8
{
    public static void main(String args[])
    {
byte x=12;
String s="123";
String s1= Byte.toString(x);

Byte a1 =Byte.valueOf(s);
Byte a2 =Byte.valueOf(x);
String s3=Byte.toString(x);

System.out.println("byte value into String :"+s3);
System.out.println("byte value into Byte instance :"+a2);
System.out.println("String instance into Byte instance  :"+a1);
    }

}