class Assign25
{
    public  static void main(String args[])
    {
        float l =23.34f;        
        Float a1=new Float(l);
        byte b=a1.byteValue();
        System.out.println(" Float instance into byte:"+b);

        short s=a1.shortValue();
         System.out.println(" Float instance into short:"+s);
         
         int x=a1.intValue();
          System.out.println(" Float instance into int: "+x);

          long y=a1.longValue();
           System.out.println(" Float instance into long:"+y);
           
           float z=a1.floatValue();
            System.out.println(" Float instance into float:"+z);
            
            double d=a1.doubleValue();
             System.out.println(" Float instance into double:"+d);
                         
 }
}