
// A
// B C 
// D E F 
// G H I J 

import java.util.* ;

public class C_half_pyramid{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        char ch = 'A'; 
        int n = sc.nextInt(); 

        for(int line=1;line<=n; line++){
            for(char word=1; word<=line;word++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }


    }
}