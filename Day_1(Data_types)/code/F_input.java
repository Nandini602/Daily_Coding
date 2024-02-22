
import java.util.*;

public class F_input{ 

  // taking inputs form the user
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in); 
    System.out.println("plz enter the integer value");
    int n = sc.nextInt(); 
    System.out.println(n); 


    System.out.println("plz enter the float value");
    float f = sc.nextFloat(); 
    System.out.println(f);

    System.out.println("plz enter the long value");
    long l = sc.nextLong(); 
    System.out.println(l);

    System.out.println("plz enter the double value");
    double  d = sc.nextDouble();   
    System.out.println(d); 

    System.out.println("plz enter the charactor value");
     String  ch = sc.next(); 
    System.out.println(ch); 

    System.out.println("plz enter the String value");
    String  s = sc.nextLine(); 
    System.out.println(s); 

    System.out.println("plz enter the Boolean value");
    Boolean  b = sc.nextBoolean(); 
    System.out.println(b);

    System.out.println("plz enter the short value");
    short sh = sc.nextShort(); 
    System.out.println(sh);


    System.out.println("plz enter the byte value");
    byte by = sc.nextByte(); 
    System.out.println(by);
}   

}