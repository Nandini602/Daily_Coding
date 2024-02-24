
import java.util.*;
public class E_tax{
    public static  void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the income"); 
        int income = sc.nextInt();
        if(income <500000){
            System.out.println(income + " not need to pay  tax");
        }
        else if(income>500000 && income <1000000){
            System.out.println((income* 20/100)  + "you have to pay 20% tax" );
        }
        else{
            System.out.println((income*30/100) + "you have to pay  30 % tax ");
        }
    }
}