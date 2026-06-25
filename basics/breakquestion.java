
package basics;

import java.util.Scanner;

public class breakquestion {

     public static void main(){


      Scanner sc= new Scanner(System.in);

      int n ;

      while (true){
        n= sc.nextInt();
          if(n%10 == 0){
             System.out.println("multiple of 10 is not accepted here ... ");
            break;
          }
        System.out.println(n);
        

      }
 sc.close();
     }
}




///keep entering numbering till users enters a multiple of 10 ;
