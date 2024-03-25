
// find the laregst number in a given array 


import java.util.*; 

public class E_largest{ 
    public static  int largest(int arr[]){
        int largest = Integer.MIN_VALUE; // infinity 

        for(int i=0; i<arr.length;i++){
            if(largest < arr[i]){
                largest = arr[i];
            }  

            
        }
        return largest;
    }
    public static void main(String args[]){
        int arr[] = {1,2,6,3,5} ;  
       System.out.println("largest number " + largest(arr) );
    }
}