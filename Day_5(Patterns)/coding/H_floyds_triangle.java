
// 1
// 2 3 
// 4 5 6 
// 7 8 9 10 
// 11 12 13 14 15 


public class H_floyds_triangle{

    public static void floyds_triangle(int n){
        int number =1;
        //outer 
        for(int i=1;i<=n;i++){
            //inner - how many times will counter be printed 

            for(int j=1;j<=i;j++){
                System.out.print(number + " " );
                number++;
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        floyds_triangle(5);
    }
}