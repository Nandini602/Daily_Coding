
// keep  entering number til user enters a multiple of 10

import java.util.*; 

public class G_break{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.println("enter your number  : "); 
            int n = sc.nextInt(); 

            if(n % 10 == 0){
                break;
            }
            System.out.println(n);
        }while(true);
    }
}