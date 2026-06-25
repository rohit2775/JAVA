 package basics;

import java.util.Scanner;

public class sumnatural {
 
    public static void main (){
     
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter the no to find the sum of natural numbers to it ....");
    
        int num = sc.nextInt();
         int sum=0 ;

         int i = 1;

        while (i<=num) {
            sum+=i;
            i++;


        }
    System.out.println(sum);
     sc.close();
    }
 }