class Assign20
{
    public static void main(String a[])
    {
        long l= 12214567;
        String b=Long.toString(l);
        System.out.println("long value into String :"+b);


        Long a1=Long.valueOf(l);
        System.out.println("Long value into Long instance :"+a1);

        String s="3345";
        Long a2=Long.valueOf(s);
        System.out.println("String value into Long instance  :"+a2);

    }
}