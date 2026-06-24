package basics;

import java.util.*;

public class oddeven {

    public static void main (){

          
          System.out.println("enter a number and check if the number is odd oe even  ");
          Scanner sc = new Scanner(System.in);

          int  num = sc.nextInt();

          if (num % 2 == 0){
            System.out.println(" the number is even ");
          }
          else {
            System.out.println("the number is odd");
          }

 
  sc.close();

    }
}