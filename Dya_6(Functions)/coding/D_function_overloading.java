
public class D_function_overloading{
    public static void sum(int a ,int b ,int c){
        System.out.println("sum of the 3 interger parameter");
        int sum = a+b+c;
        System.out.println("sum  " + sum);
   } 

   public static void sum(int a ,int b){
     System.out.println("sum of 3 interger  parameter"); 
     int sum = a+b;
     System.out.println("sum " + sum);
   }

   public static void  sum(float a , float b, float c ){
    System.out.println("sum of 3 float parameter "); 
     float sum  = a+b+c;
     System.out.println("sum " + sum);
   }
    public static void main(String args[]){
         sum(5,6,3); 
         sum(1,2); 
         sum(12.4f,54.6f,12.4f);
    }
}