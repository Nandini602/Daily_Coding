

public class I_bineary{ 
    
    public static int bineary_search(int arr[], int key){
        int start=0 ; 
        int end = arr.length-1; 
        
        while(start <= end){
            int mid = (start + end)/2;

            if(arr[mid] == key){ //found
                return mid;
            }
            if(arr[mid]<key){ //right
                start = mid +1;
            }else{//left
                end = mid-1;
            }
        } 
        return -1;

    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,7};
        int key = 5; 
        System.out.println("index for key is:  "+ bineary_search(arr,key));
    }
}