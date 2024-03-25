
public class H_smallest{ 

    public static void search(int arr[]){
         
         int smallest = Integer.MAX_VALUE;

         for(int i=0;i<arr.length;i++){
            if(smallest > arr[i]){
                  smallest = arr[i];
            } 
         }
         System.out.println("smallest number is " + smallest);
    }
    public static void main(String args[]){
        int arr[] = {11,4,6,7,84,1};
        search(arr);
    }
}