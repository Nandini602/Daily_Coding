
public class C{
     
     public static int reverse(int n){
         
         int rev = 0 ;
         while(n>0){
            int lastdigit = n % 10 ;
            rev = (rev *10) + lastdigit;
            n = n/10;

         }
         return rev;
     }
     public static void check(int n){
          int rev =  reverse(n); 

          if(rev == n){
            System.out.println("number is palindrome  " +  n );
          }
          else{
            System.out.println("number is not  palindrome" +  n );
          }
     }
    public static void main(String args[]){
         check(121);
    }
}