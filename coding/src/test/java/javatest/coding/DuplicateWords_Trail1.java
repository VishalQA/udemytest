package javatest.coding;



//Java program to count the number  
//of occurrence of a word in 
//the given string given string 
import java.io.*; 


public class DuplicateWords_Trail1 {

	
		
	    public static void main(String[] args) {  
	        String string = "I am am trying trying trying to learn java java java java playin playin ";  
	        int count;  
	   
	          
	        //Converts the string into lowercase  
	        string = string.toLowerCase();  
	        System.out.println(string);
	          
	        //Split the string into words using built-in function  
	        String words[] = string.split(" ");  
	        System.out.println("Total words ===== >  " +words.length);
	        System.out.println("Duplicate words in a given string : ");   
	        
	    
	        for(int i = 0; i < words.length; i++) { 
	        	
	        
	        	
	            count = 1;  
	            
	            
	            for(int j = i+1; j < words.length; j++) {  
	                if(words[i].equals(words[j])) {  
	                    count++;  
	                  
	                    //Set words[j] to 0 to avoid printing visited word 
	                
	                    System.out.println(words[j]);
	                
	                
	                    words[j] = "0";  
	                   
	                   
	                }  
	           
	            }  
	           
	            //Displays the duplicate word if count is greater than 1 
	            
	            if(count > 1 && words[i] != "0")  
	                System.out.println(words[i]);
	            
	           
	        }  
	       
	    }
	  
	}
