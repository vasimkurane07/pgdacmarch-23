class Program
{
    public static void main(int x)
    {
        System.out.println(x);
    }
}

class Test
{
 public static void main(String []args)
    {
        System.out.println("hello main");
        Program.main(23);
    }
}
//this code will compile properly when we give command javac Program.java as it is a our filename 
// which will give us the two .class file as they are two class here(also give when there is enum or interface) 
//but when we are going tp run the program then that time we have to give the class name 
// which have main fun because at run time jvm looks for main fun in class which have 
// we mention during execution.  