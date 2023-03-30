class Assign13
{
    public static void main(String a[])
    {
        short sh= 1221;
        String b=Short.toString(sh);
        System.out.println("short value into String :"+b);


        Short a1=Short.valueOf(sh);
        System.out.println("short value into Short instance :"+a1);

        String s="3345";
        Short a2=Short.valueOf(s);
        System.out.println("String value into Short istance  :"+a2);

    }
}