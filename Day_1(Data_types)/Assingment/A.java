 

 // in a program input 3 number A,B and C . you have  to  output the agerage of these 3 number 

 import java.util.*;

 public class A{
    public  static void main(String args[]){
        Scanner sc =new Scanner(System.in); 
        int a = sc.nextInt(); 
        int b = sc.nextInt(); 
        int c = sc.nextInt();

        int avg = (a+b+c)/3; 
        System.out.println(avg);
    }
 }