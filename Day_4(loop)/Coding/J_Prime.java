
// check if the number is prime or not 
import java.util.*;
public class J_Prime{
    public static void main(String args[]){
          
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        
        boolean isprime = true;
        if(n == 2){
            System.out.println( "n is prime ");
        }
        else{
            for(int i=2 ; i<=n-1;i++){
                if(n%i == 0){
                    isprime = false;
                }
            }
        }

        if(isprime == true){
            System.out.println(" n is prime ");
        }
        else{
            System.out.println("is not prime " + n );
        }
    }
}