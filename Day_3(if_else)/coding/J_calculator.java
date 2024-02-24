
import java.util.*; 

public class J_calculator{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in); 
    System.out.println("enter the operator");
    String ch = sc.next(); 
    int a = 5; 
    int b = 2 ;   

    switch(ch){
        case "+":
            System.out.println(a+b);
        break; 

        case "-":
            System.out.println(a-b);
        break;

        case "*":
            System.out.println(a*b);
        break;

        case "/":
            System.out.println(a/b);
        break;

        case "%":
            System.out.println(a%b);
        break;

        default: 
        System.out.println("you enter  the wrong  operator");
        break;
    }

    }
}