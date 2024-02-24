
//find the largest of two number

import java.util.*;
public class B_largest{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
        System.out.println("enter the value of a and b ");
        int a = sc.nextInt(); 
        int b = sc.nextInt(); 

        if(a>=b){
            System.out.println(" a is geater than b");
        }
        else{
            System.out.println("b is greater than a");
        }
        
    }
}