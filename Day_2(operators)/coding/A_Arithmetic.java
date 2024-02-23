 
// arithmatic operator :  + , - ,  *, / ,% ;
import java.util.*; 

public class A_Arithmetic{
    public  static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
        System.out.println("enter the value of a and b");
        int a = sc.nextInt(); 
        int b = sc.nextInt(); 

        System.out.println("Add = " + (a+b)); 
        System.out.println("sub = "  + (a-b)); 
        System.out.println("Mul  = " + (a*b)); 
        System.out.println("div = " + (a/b)); 
        System.out.println("modulu = " + (a%b));
    }
}