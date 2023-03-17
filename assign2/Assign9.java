public class Assign9
{

public static void main(String args[])
{
int i,j,k;
int alpha=64;
for(i=1;i<=5;i++)
{
	for(j=4;j>=i;j--)
	{
		System.out.print(" ");
		
	}
	for(k=1;k<=i;k++)
	{
	System.out.print((char)(alpha+k)+"  ");
	}
	System.out.println();
}
}
}