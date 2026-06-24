 package basics;

import java.util.Scanner;

public class calculator {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

         System.out.println("enter any two numbers for performing mathematical operation ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("enter your choice for mathematical calculation");
        System.out.println("enter 1 for addition ");
        System.out.println("enter 2 for subtraction");
        System.out.println("enter 3 for multiplicaton");
        System.out.println("enter 4  for division ");

        int num = sc.nextInt();
        switch(num){
         case 1 : System.out.println(a+b);
                  break;
         case 2 : System.out.println(a-b);
                  break;
         case 3 : System.out.println(a*b);
                  break;
         case 4: System.out.println(a/b);
                 break; 

default : System.out.println("choose any one for the operation ");


        }

        sc.close();
    }
}