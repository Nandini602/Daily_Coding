

public class B_update{

    public static void update(int arr[]){
        for(int i=0;i<arr.length;i++){
            arr[i] = arr[i]+1;
        }
    }
    public static void main(String arg[]){
        int arr[] = {1,2, 3, 4, 5}; 
        
        System.out.print("original array   ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }


        update(arr); 
        System.out.print("\n updated array  ");

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }

    }
}