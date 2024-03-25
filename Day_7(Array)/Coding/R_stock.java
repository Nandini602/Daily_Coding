

public class R_stock{
    public static int stock(int price[]){
        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0 ; 

        for(int i =0;i<price.length;i++){
            if(buyprice < price[i]){
                int profit = price[i] - buyprice; // today profit 
                maxprofit = Math.max(maxprofit , profit);

            }else{
                buyprice = price[i];
            }
        } 
        return maxprofit;
    }
    public static void main(String args[]){
        
         int arr[] = {7,1,5,3,6,4};
         System.out.println(stock(arr));
    }
}