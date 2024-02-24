
import java.util.*; 
public class H_pass{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
        int marks = sc.nextInt(); 

       String  result = (marks >=33)? "Pass" : "fail";
       System.out.println(result);
    }
}