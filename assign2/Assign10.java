public class Assign10
{

public static void main(String args[])
{
int counter=64;
int i,j,k;

for(i=5;i>=1;i--)
{
	for(j=1;j<=i;j++)
	{
		System.out.print(" ");
		
	}
	for(k=i;k<=5;k++)
	{
	
	System.out.print((char)(counter+k)+" ");
	}
	System.out.println();
}
}
}