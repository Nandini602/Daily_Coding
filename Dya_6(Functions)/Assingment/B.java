
public class B{
    public static boolean even(int n){
        if(n%2 == 0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
       boolean ans =  even(787);
       System.out.println(ans);
    }
}