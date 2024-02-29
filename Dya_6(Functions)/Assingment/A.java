

public class A{
    public static int avg (int a , int b , int c){
        int avg = (a+b+c)/3; 

        return avg;
    }
    public static void main(String args[]){
        int a = 4; 
        int b = 3; int c =4; 

         int ans = avg(a,b,c);
         System.out.println("avg is = " + ans);
    }
}