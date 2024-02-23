
import java.util.*; 
// gives ans in true or false 
public class C_relational{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
        System.out.println("enter the value of a,b");
        int a = sc.nextInt(); 
        int b = sc.nextInt(); 

        System.out.println("a==b  " + (a== b));
        System.out.println("a!=b  " + (a!= b));
        System.out.println("a>b  " +   (a>= b));
        System.out.println("a<b  " + (a<b));
        System.out.println("a>=b  " + (a>= b));
        System.out.println("a<=b  " + (a<= b));
        
    }
}