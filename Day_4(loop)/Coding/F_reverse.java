
// reverse the given number  

import java.util.*; 
public class F_reverse{
    public static void main(String args[]){
        System.out.println(" plz , enter the number"); 
        Scanner sc = new Scanner(System.in); 
        int number = sc.nextInt(); 

        int i = 1; 
        while(number>0){
            int rev = 0;
            int lastdigit = number%10; 
            rev = (rev *10) +lastdigit;
            System.out.print(rev + " ");
            number = number/10;

        }
    }
}