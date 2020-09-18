package finalcode;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Two_StringToPalindrome {

	static int removeSpaces(char []str) 
	{ 
	    // To keep track of non-space character count 
	    int count = 0; 
	    System.out.println("count ======>"  +count);
	  
	    // Traverse the given string. //If current character 
	    // is not space, then place // it at index 'count++' 
	    for (int i = 0; i<str.length; i++) 
	        if (str[i] != ' ') 
	            str[count++] = str[i]; // here count is  incremented 
	          System.out.println("count========>"  +count);
	    return count; 
	} 
	  
 
	 
	 public static Set<CharSequence> printAllPalindromes(CharSequence charSequence) {
		    if (charSequence.length()  <= 1) {
		        return Collections.emptySet();
		        
		    }
		    Set<CharSequence> out = new HashSet<CharSequence>();
		    int length = charSequence.length();
		    System.out.println("lenghth ========>  "  +length);
		    for (int i = 0; i < length; i++) {
		    	System.out.println("i === >  "  +i);
		        for (int j = i+1 ; j < length+1;j++) {
		        	System.out.println("j === >  " +j);

		        	String s = ((StringBuffer) charSequence).substring(i, j);                   
		                StringBuffer sb = new StringBuffer(s);
		                sb.reverse();

		                if(s.equals(sb.toString()) && s.length()>1)
		                {                       
		                	out.add(s);
		                }
		            }
		        }           
		        System.out.println("out=====> "  +out);
		        return out;
		    }
		    
		    
		
	// Driver code 
	public static void  main(String[] args) 
	{ 
		 System.out.println("Given String is ===>   aa ab acc aa ");
	    char str[] = "aa ab acc aa ".toCharArray(); 
	    System.out.println("str =========>"  +str);
	    
	  
	    int k = removeSpaces(str); 
	    System.out.println("k========>"  +k);

	 
	    
	     CharSequence CharSequence = String.valueOf(str).subSequence(0, k); 
	     
	    System.out.println("charseq=========>  "  +CharSequence);
	   

	    
	    
	    if (CharSequence.length() <= 1) 
	    {
	        System.out.println("Not Palindrome Found.");
	    }
	    else
	    {   
	        int length = CharSequence.length();            
	        Set<String> set = new HashSet<String>();
	        for (int i = 0; i <length; i++)
	        {
	            //if(i==0)
	            for (int j=i+1;j<length+1;j++) 
	            {
	                String s = ((String) CharSequence).substring(i, j);                   
	                StringBuffer sb = new StringBuffer(s);
	                sb.reverse();

	                if(s.equals(sb.toString()) && s.length()>1)
	                {                       
	                    set.add(s);
	                }
	            }
	        }           
	        System.out.println(set);
	    }
	  }
	 
	}  
	  
