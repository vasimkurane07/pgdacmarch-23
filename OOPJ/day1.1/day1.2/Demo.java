class Demo
{
    public static void main(String args[])
    {
        System.out.println("hello demo");
    }
}

class A
{
    public static void main(String args[])
    {
        System.out.println("hello a");
    }
}

class B
{
    public static void main(String args[])
    {
        System.out.println("hello b");
    }
}

// so here what is happening that we have 3 class so after compiling we will have 3 .class file
//in each class there is main fun so at execution whichever we mention the class name 
//of that class jvm will look foe main fun and execute that not execute the other one 
// to see the bytecode means .class file we can use command javap -c class name.