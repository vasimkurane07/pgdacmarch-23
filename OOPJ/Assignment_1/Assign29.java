class Assign29
{
    public  static void main(String args[])
    {
        double l =23324.231;        
        Double a1=new Double(l);
        byte b=a1.byteValue();
        System.out.println(" Double instance into byte:"+b);

        short s=a1.shortValue();
         System.out.println(" Double instance into short:"+s);
         
         int x=a1.intValue();
          System.out.println(" Double instance into int: "+x);

          long y=a1.longValue();
           System.out.println(" Double instance into long:"+y);
           
           float z=a1.floatValue();
            System.out.println(" Double instance into float:"+z);
            
            double d=a1.doubleValue();
             System.out.println(" Double instance into double:"+d);
                         
 }
}