
public class H_bin_to_dec{

    public static void bintodec(int binnum){
         int mynum = binnum;
           int pow = 0 ; 
           int decnum = 0 ; 

           while(binnum > 0 ){
             int lastdigit = binnum %10; 

             //formula 
             decnum = decnum + (lastdigit *(int)Math.pow(2,pow));
             pow ++; 
             binnum = binnum/10;
           }
           System.out.println("decimal of " + mynum + " = " + decnum);
    }
    public static void main(String args[]){
    bintodec(1111); 

    }
}