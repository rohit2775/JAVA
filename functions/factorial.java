package functions;

import java.util.Scanner;

public class factorial {
     
        public static int fact(int n){
        
            int f=1;
            for( int i=1; i<=n;i++){

                f=f*i;
            }
            return f ;
            
        }



    public static void main(){
         
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to find the factorial .....");

        int n = sc.nextInt();

        int ans = fact(n);
        System.out.println("the factorial is .. "+ ans);


sc.close();
    }
}
