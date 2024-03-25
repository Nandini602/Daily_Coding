
import java.util.*;
//find the index of elements in a  given array and key =10
public class C_linear_search{

    public static int linear(int arr[] , int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == key){
                return i;
            }
        } 

        return -1;
    }
    public static void main(String args[]){
        int arr[] ={2,4,6,8,10,12,14,16};  
        int key = 10;
         int index =linear(arr,key); 

        if(index == -1){
            System.out.println("key is not found");
        }
        else{
            System.out.println("key is found at index " + index);
        }
    }
}