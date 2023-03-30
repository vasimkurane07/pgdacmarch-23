class Assign14
{
    public  static void main(String args[])
    {
        short value =1245;
         Short a1=new Short(value);
        byte b=a1.byteValue();
        System.out.println("Short instance into byte:"+b);

        short s=a1.shortValue();
         System.out.println("Short instance into short:"+s);
         
         int x=a1.intValue();
          System.out.println("Short instance into int: "+x);

          long y=a1.longValue();
           System.out.println("Short instance into long:"+y);
           
           float z=a1.floatValue();
            System.out.println("Byte instance into float:"+z);
            
            double d=a1.doubleValue();
             System.out.println("Byte instance into double:"+d);
                         
 }
}