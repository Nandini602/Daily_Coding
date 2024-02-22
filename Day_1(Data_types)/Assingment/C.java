
import java.util.*; 

public class C{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
        System.out.println("enter the value of pen,pencil,eraser"); 

        int pen = sc.nextInt(); 
        int pencil = sc.nextInt(); 
        int eraser = sc.nextInt(); 

        int total_cost = (pen + pencil + eraser); 
        System.out.println("total_cost " + total_cost);

        float gst = total_cost +(total_cost * 0.18f); 
        System.out.println("bill with 18% gst  "   + gst);
    }
}