package finalcode;

//Java program to calculate sum of all numbers present  
//in a string containing alphanumeric characters  

 
public class One_SumOfNumbersFromString_Answer2 {


 // Function to calculate sum of all numbers present  
 // in a string containing alphanumeric characters  
 static int findSum(String str)  
 {  
     // A temporary string  
     String temp = "0";  
   System.out.println("temp =======>>  "  +temp);
     // holds sum of all numbers present in the string  
     int sum = 0;  
     System.out.println("sum=========> "  +sum);
   
     // read each character in input string  
     for(int i = 0; i < str.length(); i++)  
     {  
         char ch = str.charAt(i); 
         System.out.println("character========>  " +ch);
           
         // if current character is a digit  
         if (Character.isDigit(ch))  {
             temp += ch;  
             System.out.println("temp=========>  "  +temp);
         }
         // if current character is an alphabet  
         else if (!"0".equals(temp))
         {  
        	 System.out.println("temp  ========>  "  +temp);
             // increment sum by number found earlier  
             // (if any)  
             sum += Integer.parseInt(temp);  
             
             System.out.println("sum========>  "  +sum);
   
             // reset temporary string to empty  
             temp = "0";  
             
             System.out.println("temp ==========>" +temp);
         }  
     }  
   
     // atoi(temp.c_str()) takes care of trailing  
     // numbers  
     return sum + Integer.parseInt(temp);  
 }  
   
 // Driver code  
 public static void main (String[] args) 
 { 
       
     // input alphanumeric string  : 1 + 23 + 456 + 7890
     String str = "ank1tr23cbdf456try7890ts";  
   //Remove ank from above value to get the output - ie if u add any alphabet at start it throws an error 
     System.out.println(findSum(str)); 
 } 
} 