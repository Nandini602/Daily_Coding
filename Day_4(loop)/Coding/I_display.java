
import java.util.*; 

public class I_display{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int i = 0 ; 
        do{
            System.out.println("plz , enter the number "); 
            int n = sc.nextInt(); 
            if(n%10 == 0){
                continue;
            }
            System.out.println("you enter the number  " + n);
            i++;
        }while(true);
    }
}