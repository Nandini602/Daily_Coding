

public class F_prime{
    public static boolean Isprime(int n ){
        boolean Isprime = true; 
        for(int i=2; i<=n-1;i++){
            if(n % i ==0){//completely dividing
                Isprime = false;
                break;
            }
        }
        return Isprime;

    }
    public static void main(String args[]){
        System.out.println(Isprime(12));
    }
}