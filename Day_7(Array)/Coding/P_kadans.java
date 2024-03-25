
public class P_kadans{ 

    public static void kadanes(int arr[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0 ; 

        for(int j=0;j<arr.length;j++){
            cs = cs + arr[j];
            if(cs < 0){
                cs =0;
            } 
            ms = Math.max(cs , ms);
        } 
        System.out.println("our max subarray sum is " + ms);
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,45,6};
        kadanes(arr);
    }
}