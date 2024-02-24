
import java.util.*; 

public class D_else_if{
    public static void main(String agrs[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the age");
        int age = sc.nextInt();  

        if(age >=18){
            System.out.println("you can vote");
        }
        else if(age>=13  && age<=18){
            System.out.println("you are teenager");
        }
        else{
            System.out.println("you can not vote");
        }


    }
}