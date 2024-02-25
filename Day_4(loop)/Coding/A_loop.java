
//print first  100 number with help of the loop 

public class A_loop{
    public static void main(String args[]){
        // while loop 
       
       System.out.println("start of the while loop");
        int  i = 1 ; 
        while(i<=10){
            System.out.println(i);
            i++;
        }
        System.out.println("end of while loop");
 

        // for loop 
         System.out.println("start of the for loop");
         for(int j=1;j<=10;j++){
            System.out.println(j);
         }
          System.out.println("end of for loop"); 

          // do while loop 
           System.out.println("start of the do-while loop");
          int k =1; 
          do{
            System.out.println(k); 
            k++;
          }while(k<=10);
          System.out.println("end of do-while loop");
    }
}