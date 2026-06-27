
package functions;

public class multiply {

    public static int product(int a , int b){
           int num1 =a;
           int num2 = b;

        return(num1*num2);

    }


    public static void main(){
   
         int a =5;
         int b =234;
         int sum = product(a, b);
         System.out.println(sum);

    }
}