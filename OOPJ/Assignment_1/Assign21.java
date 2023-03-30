class Assign21
{
    public  static void main(String args[])
    {
        Long l =2323544l;        
        Long a1=new Long(l);
        byte b=a1.byteValue();
        System.out.println(" Long instance into byte:"+b);

        short s=a1.shortValue();
         System.out.println(" Long instance into short:"+s);
         
         int x=a1.intValue();
          System.out.println(" Long instance into int: "+x);

          long y=a1.longValue();
           System.out.println(" Long instance into long:"+y);
           
           float z=a1.floatValue();
            System.out.println(" Long instance into float:"+z);
            
            double d=a1.doubleValue();
             System.out.println(" Long instance into double:"+d);
                         
 }
}