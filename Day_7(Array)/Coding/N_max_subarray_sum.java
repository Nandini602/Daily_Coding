public class N_max_subarray_sum{

    
    public static void max_subarray_sum(int arr[]){
         
         int currsum = 0 ; 
         int maxsum = Integer.MIN_VALUE;
        //first find the subarray 
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {   
                currsum = 0 ;
                for(int k=i;k<=j;k++){
                   currsum  += arr[k]; 
                   System.out.println(arr[k] );
                } 
                System.out.println("currsum " + currsum);
                    if(maxsum < currsum) {
                       maxsum = currsum;
                    }   
                         
                 
            } 

        } 
        System.out.println("max sum  = " +  maxsum);
    }
    public static void main(String args[]){
        int arr[] = {2,4,6,8,10};
         max_subarray_sum(arr);
    }
}