
public class B_factorial{
    public static int fact(int n){
        int fact = 1;
        for(int i=1; i<=n; i++){
         fact = fact * i ; 
        }
        return fact;
    }
    public  static void main(String args[]){
        int  ans =  fact(5);
        System.out.println(ans);
    }
}