
// 1
// 0 1 
// 1 0 1
// 0 1 0 1
// 1 0 1 0 1 

public class I_0_1_triangle{
    public static void triangle(int n){
        for(int i=1;i<=n; i++){ //outer loop

            for(int j=1;j<=i;j++){
                if((i+j)%2 == 0){
                    System.out.print(1 + " ");
                }
                else{
                    System.out.print(0 + " ");
                }
            }
            System.out.println();

        }
    }
    public static void main(String args[]){
        triangle(5);
    }
}