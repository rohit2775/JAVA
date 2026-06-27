
package functions;

import java.util.Scanner;

public class syntax2 {

       public static int SUM(int num1 , int num2){      
        return(num1 +num2); 
        }

    public static void main(){
      Scanner sc = new Scanner(System.in);
          System.out.println("type any two numbers to add them ");
      int a = sc.nextInt();
      int b = sc.nextInt();

        int ANS = SUM(a, b);
        
        System.out.println("the sum is " + ANS);
      
        sc.close();
    }
}