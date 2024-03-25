 // reverse the array


public class j_reverse{ 
    public static void reverse(int arr[]){

        int first = 0; int end = arr.length-1; 
        while(first<=end){
            int temp =  arr[end];
            arr[end] = arr[first];
            arr[first] = temp;

            first ++; 
            end --;
        }

    }
    public static void main(String args[]){
        int arr[] = {3,4,5,6,7,8,1,9};
        System.out.println("original array");

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }

         reverse(arr); 
          
          System.out.println("reverse array");
         for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"  " );
         }
    }
}