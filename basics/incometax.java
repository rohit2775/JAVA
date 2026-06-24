
package basics;

import java.util.Scanner;

public class incometax {

    public static void main(){
        System.out.println("enter ypur salary in lpa");

        Scanner sc = new Scanner(System.in);
        int salary = sc.nextInt();
        if (salary <5){
            System.out.println("no tax ");
        }
        else if((salary  > 5) && (salary <10)){
           System.out.println("20 % tax must be paid");
        }
        else if(salary >10){
            System.out.println("30 % tax must be paid ");
        }

        else {
          System.out.println("");
        }


        sc.close();
    }

     
}