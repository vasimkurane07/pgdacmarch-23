class Assign28
{
    public static void main(String a[])
    {
        double l= 122.2334;
        String b=Double.toString(l);
        System.out.println("Double value into String :"+b);


        Double a1=Double.valueOf(l);
        System.out.println("Double value into Double instance :"+a1);

        String s="3345.007";
        Double a2=Double.valueOf(s);
        System.out.println("String value into Double instance  :"+a2);

    }
}