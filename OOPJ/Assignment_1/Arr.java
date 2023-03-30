import java.util.Scanner;		
class Arr
{	
public static void main(String args[])
{
int x,n,z,max,min,key,i;
Scanner sc= new Scanner(System.in);
System.out.println("enter the size of array");
n=sc.nextInt();
int a[]=new int[n];



System.out.println("enter the elements of an array");
for(i=0;i<n;i++)
{
	a[i]=sc.nextInt();
}

for(i=0;i<n;i++)
{
	System.out.println(a[i]);
}


x=sc.nextInt();

max=a[0];
	for(i=1;i<n;i++)
	{
		if(max<a[i])
		{
			max=a[i];
		}
	
	}
	System.out.println("Max value :"+max);
}
}