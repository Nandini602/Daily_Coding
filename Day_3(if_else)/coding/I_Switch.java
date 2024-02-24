
import java.util.*; 

public class I_Switch{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("plz enter the number");
        int number = sc.nextInt(); 

        switch(number)
        {
            case 1 : 
            System.out.println("you enter the one");
            break; 

            case 2 : 
            System.out.println("you enter the  two"); 
            break; 

            case 3 :
            System.out.println("you enter the three"); 
            break; 

            case 4 : 
            System.out.println("you enter the fourth");
            break; 
            
            default : 
            System.out.println("you enter  the wrong number");
            break;
        }
    }
}