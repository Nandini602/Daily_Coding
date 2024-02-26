
// 1 2 3 4 5 
// 1 2 3 4
// 1 2 3
// 1 2 
// 1 


public class G_inverted_half_pyramid{ 
    public static void inverted_half_pyramid_withNumber(int n){
        for(int  i=1; i<=n;i++){
            //inner - number 
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
          inverted_half_pyramid_withNumber(6);
    }
}