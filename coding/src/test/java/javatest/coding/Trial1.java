package javatest.coding;

import java.lang.Character.Subset;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Trial1 {

	// An efficient Java program to remove all spaces 
	// from a string 
	
	// Function to remove all spaces  
	// from a given string 
	static int removeSpaces(char []str) 
	{ 
	    // To keep track of non-space character count 
	    int count = 0; 
	  
	    // Traverse the given string. 
	    // If current character 
	    // is not space, then place  
	    // it at index 'count++' 
	    for (int i = 0; i<str.length; i++) 
	        if (str[i] != ' ') 
	            str[count++] = str[i]; // here count is 
	                                    // incremented 
	          
	    return count; 
	} 
	  
	//below 1
//	 static int CountPS(char str[], int n) 
//	    { 
//	        // create empty 2-D matrix that counts all palindrome 
//	        // substring. dp[i][j] stores counts of palindromic 
//	        // substrings in st[i..j] 
//	        int dp[][] = new int[n][n]; 
//	       
//	        // P[i][j] = true if substring str[i..j] is palindrome, 
//	        // else false 
//	        boolean P[][] = new boolean[n][n]; 
//	       
//	        // palindrome of single length 
//	        for (int i= 0; i< n; i++) 
//	            P[i][i] = true; 
//	       
//	        // palindrome of length 2 
//	        for (int i=0; i<n-1; i++) 
//	        { 
//	            if (str[i] == str[i+1]) 
//	            { 
//	                P[i][i+1] = true; 
//	                dp[i][i+1] = 1 ; }}
//			return n;
//	            }
	 
	 //below 
	 
	 public static Set<CharSequence> printAllPalindromes(CharSequence charSequence) {
		    if (charSequence.length()  <= 1) {
		        return Collections.emptySet();
		    }
		    Set<CharSequence> out = new HashSet<CharSequence>();
		    int length = charSequence.length();
		    System.out.println(length);
		    for (int i = 0; i < length; i++) {
		    	System.out.println("i === >  "  +i);
		        for (int j = i+1 ; j < length+1;j++) {
		        	System.out.println("j === >  " +j);
//		        	System.out.println("k === >  "  +k);
//		            if (charSequence.charAt(j) == charSequence.charAt(k)) {
//		                out.add(charSequence.subSequence( j , k +1));
//		                System.out.println(out.add(charSequence.subSequence( j , k +1)));
//		            } else {
//		                break;
		        	String s = ((StringBuffer) charSequence).substring(i, j);                   
		                StringBuffer sb = new StringBuffer(s);
		                sb.reverse();

		                if(s.equals(sb.toString()) && s.length()>1)
		                {                       
		                	out.add(s);
		                }
		            }
		        }           
		        System.out.println(out);
		        return out;
		    }
		    
		    
		
	// Driver code 
	public static void  main(String[] args) 
	{ 
	    char str[] = "aa ab acc aa ".toCharArray(); 
	    int k = removeSpaces(str); 
	 
	    
	     CharSequence CharSequence = String.valueOf(str).subSequence(0, k); 
	     
	    System.out.println(CharSequence);
	   
//	    printAllPalindromes( CharSequence);
	    System.out.println(printAllPalindromes( CharSequence));
	} 
	}  
	  
