
package in.cdac.lab;
import java.util.*;
class EvenOdd
{
	int even;
	int odd;
	public int getEven() {
		return even;
	}
	public void setEven(int even) {
		this.even = even;
	}
	public int getOdd() {
		return odd;
	}
	public void setOdd(int odd) {
		this.odd = odd;
	}
	
	
}

public class Count2 {
	static EvenOdd fun(int n) {
		EvenOdd value1 = new EvenOdd();
		
		 int even_count = 0;
		    int odd_count = 0;
		    while (n > 0) 
		    {
		        int rem = n % 10;
		        
		        if (rem % 2 == 0){
		            even_count++;
		        }
		      
		        else {
		            odd_count++;
		        }
		        n = n / 10;
		    }
		    value1.setEven(even_count);
		    value1.setOdd(odd_count);
		    
		// TODO Auto-generated method stub
		    return value1;
	}
	public static void main(String[] args) {
		
	try (Scanner sc = new Scanner(System.in)) {
		System.out.println("enter the no");
			EvenOdd value = Count2.fun(sc.nextInt());
			System.out.println("Even count :"+value.getEven()+" Odd count : "+value.getOdd());
	}
	
	}

	
}
