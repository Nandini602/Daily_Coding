
public class D_linear{
    public static int search(String fruits[], String target){

        for(int i=0;i<fruits.length;i++){
            if(fruits[i].equals(target)){ //only diff
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        String fruits[] ={"mango","apple","kiwi","banana"};
        String  target = "banana";
        int  index = search(fruits ,target); 

        if(index != -1){
            System.out.println("target is  found at index  " + index);
        }
        else{
            System.out.println("key is not  found at index");
        }
    }
}