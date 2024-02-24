
import java.util.*; 

public class F_largest{
    public static  void main(String agrs[]){
        int a = 1 ; 
        int b = 3; 
        int c = 6 ; 

        if(a > b && a>c){
            System.out.println("largest is a " + a);
        }
        else if( b>a && b>c){
            System.out.println("largest is b " + b);
        }
        else{
            System.out.println("largest is c " + c);
        }
    }
}