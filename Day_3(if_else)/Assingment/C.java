
import java.util.*; 

public class C{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
        System.out.println("enter the number");
        int n  = sc.nextInt(); 

        switch(n){
            case 1 : 
            System.out.println("sun");
            break;


            case 2 : 
            System.out.println("mon");
            break;

            case 3 : 
            System.out.println("tue");
            break;

            case 4 : 
            System.out.println("web");
            break;

            case 5 : 
            System.out.println("thus");
            break;

            case 6 : 
            System.out.println("fri");
            break;

            case 7 : 
            System.out.println("sat");
            break;

            default : 
            System.out.println("wrong");
            break;
        }
    }
}