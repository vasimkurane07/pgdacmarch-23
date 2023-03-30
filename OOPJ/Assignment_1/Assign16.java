class Assign16
{
    public static void main(String a[])
    {
        int sh= 1221;
        String b=Integer.toString(sh);
        System.out.println("Integer value into String :"+b);


        Integer a1=Integer.valueOf(sh);
        System.out.println("Integer value into Integer instance :"+a1);

        String s="3345";
        Integer a2=Integer.valueOf(s);
        System.out.println("String value into Integer instance  :"+a2);

    }
}