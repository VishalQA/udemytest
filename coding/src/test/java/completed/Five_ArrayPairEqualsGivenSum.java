package completed;



//Java implementation of 
//simple method to find 
//print pairs with given sum. 



public class Five_ArrayPairEqualsGivenSum {


 // Returns number of pairs 
 // in arr[0..n-1] with sum 
 // equal to 'sum' 
 static void printPairs(int arr[], 
                        int n, int sum) 
 { 
     // int count = 0; 

     // Consider all possible pairs 
     // and check their sums 
     for (int i = 0; i < n; i++) 
         for (int j = i + 1; j < n; j++) 
             if (arr[i] + arr[j] == sum) 
                 System.out.println("(" + arr[i] + ", " + arr[j] + ")"); 
 } 

 // Driver Code 
 public static void main(String[] arg) 
 { 
     int arr[] = {4, 5, 7, 11, 9, 13, 8, 12} ; 
     int n = arr.length; 
     int sum = 20; 
     printPairs(arr, n, sum); 
 } 
} 