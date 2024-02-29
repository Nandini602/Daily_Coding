

public class D{ 
    public static int sum(int a){
            int sum = 0; 
            while(a>0){
                int lastdigit = a % 10; 
                sum = sum +lastdigit;
                a/=10;
            }
            return sum;

    }
    public static void main(String args[]){
         System.out.println(sum(12));
    }
}