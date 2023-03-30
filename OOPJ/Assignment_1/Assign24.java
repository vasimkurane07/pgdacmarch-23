class Assign24
{
    public static void main(String a[])
    {
        float l= 122.23f;
        String b=Float.toString(l);
        System.out.println("Float value into String :"+b);


        Float a1=Float.valueOf(l);
        System.out.println("Long value into Float instance :"+a1);

        String s="3345.00";
        Float a2=Float.valueOf(s);
        System.out.println("String value into Float instance  :"+a2);

    }
}