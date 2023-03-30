class Assign9
{
    public  static void main(String args[])
    {
        byte value =124;
        Byte a1=new Byte(value);
        byte b=a1.byteValue();
        System.out.println("Byte instance into byte:"+b);

        short s=a1.shortValue();
         System.out.println("Byte instance into short:"+s);
         
         int x=a1.intValue();
          System.out.println("Byte instance into int: "+x);

          long y=a1.longValue();
           System.out.println("Byte instance into long:"+y);
           
           float z=a1.floatValue();
            System.out.println("Byte instance into float:"+z);
            
            double d=a1.doubleValue();
             System.out.println("Byte instance into double:"+d);
                         
 }
}