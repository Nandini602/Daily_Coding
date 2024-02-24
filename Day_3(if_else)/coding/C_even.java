

import java.util.*; 

public class C_even{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt(); 
        if(n%2 ==0){
            System.out.println("given number is even " +  n);
        }else{
            System.out.println("given number is odd " + n);
        }
    }
}