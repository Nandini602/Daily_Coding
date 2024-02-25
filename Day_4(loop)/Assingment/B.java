
import java.util.*; 

public class B{
    public static void main(String agrs[]){
        Scanner sc = new Scanner(System.in); 
        int sumeven = 0; 
        int sumodd = 0; 

      System.out.println("enter the number");
      int n = sc.nextInt();
        for(int i =1;i<=n; i++){
            if(i%2 == 0){
                sumeven = sumeven + i;
            }
            else{
                sumodd = sumodd + i;
            }
        }
        System.out.println("evensum is " + sumeven);
        System.out.println("oddsum is " + sumodd);
    }
}