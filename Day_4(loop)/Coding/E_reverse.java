
// reverse the number 10899 

public class E_reverse{
    public static void main(String args[]){
        int n = 10899; 

        // for(int i=0;i<=n;i++){   don't use i<=n
        //     int lastdigit = n %10;
        //     System.out.print(lastdigit);
        //     n = n /10;
        // } 

        int i = 1; 
        while(n>0){
            int lastdigit = n %10; 
            System.out.print(lastdigit); 
            n = n/10; 
        }
        
    }
}