package in.cdac.words;

import java.util.Scanner;

public class WordCount {  
	      static int wordcount(String string)  
	    	  {
	          
				int count=0;  
     
				    char ch[]= new char[string.length()];     
				    for(int i=0;i<string.length();i++)  
				    {  
				    	if((int)string.charAt(i)>64&&(int)string.charAt(i)<91||(int)string.charAt(i)>96&&(int)string.charAt(i)<123||(int)string.charAt(i)==32)
						{
				        ch[i]= string.charAt(i);  
				        if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )  
				            count++;  
				    } 
				    	else
				    		System.out.println("invalid input");
				    }
				    	
				    return count;
			
			 
	          
	        }  
	      public static void main(String[] args) { 
	    	  try
	    	  {
	    	  Scanner s = new Scanner(System.in);
	          String string =new String();
	          System.out.println("enter the string");
	          string = s.nextLine();
	         System.out.println(wordcount(string) + " words.");   
	         s.close();
	    	  }
	    	  finally {
	    		 
	    	  }
	    	  
	    }  
	}  

