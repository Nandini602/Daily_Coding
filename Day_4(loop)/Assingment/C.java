
// find the factorial  

import java.util.*; 
public class C{
    public static void main(String args[]){
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt(); 

        int fact=1;
        for(int i=1;i<=n;i++){
            fact = fact * i;
            //System.out.println( n + "  factorial is " + fact);
        }
         System.out.println( n + "  factorial is " + fact);
    }
}