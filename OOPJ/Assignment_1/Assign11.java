class Assign11
{
    public static void main(String a[])
    {
        String b=a[0];
        char ch=b.charAt(0);
        
        System.out.println((int)ch);

        if((int)ch>=48&&(int)ch<=57)
        {
           System.out.println((int)ch);
        }
        else if((int)ch>=97&&(int)ch<=122)
        {
            
            char c1=Character.toUpperCase(ch);
            System.out.println("UPPERCASE :"+c1);
            System.out.println((int)c1);
            
            
        }
        else if((int)ch>=65&&(int)ch<=90)
        {
         char c2=Character.toLowerCase(ch);
        System.out.println("LOWERCASE :"+c2);
        System.out.println((int)c2);
        }
    }
}