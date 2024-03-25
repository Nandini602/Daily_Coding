
import java.util.*; 

public class A_decleration{

    public static void main(String args[]){
        // int arr[] = new int[10]; //decleration of array 
      
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the size of the array");
        int n  = sc.nextInt();
        int arr[] = new int[n];

        // input of the array 
        System.out.println("enter  the elements of an array"); 
          for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        } 

        System.out.println("array that you enter"); 
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}