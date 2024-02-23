
import java.util.*; 


//unary : ++ , -- 
public class B_unary{
    public static void main(String args[]){
         int a = 10 ;
          System.out.println(a); 
         int b = a++;
          System.out.println(b); 
         int c = ++a;
         System.out.println(c);

         System.out.println("updated value");
         System.out.println(a);
         System.out.println(b);
         System.out.println(c); 

    int e1 = 5 ; 
    System.out.println(e1); 

    int e2 = e1--; 
    System.out.println(e2); 

    int e3 = --e1; 
    System.out.println(e3); 
    System.out.println("updated value");
    System.out.println(e1);
    System.out.println(e2);
    System.out.println(e2);  

    }
}