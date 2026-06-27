package functions;

import java.util.Scanner;

public class binomialcoffecient {
 
     public static int fact(int n){
        
            int f=1;
            for( int i=1; i<=n;i++){

                f=f*i;
            }
            return f ;
            
        }

        public static int BINOCOFF(int a, int b){

            int nfact = fact(a);
            int rfact= fact(b);
            int nmrfact= fact(a-b);

            int bc= nfact/(rfact * nmrfact);
            return bc;


        }


        public static void main (){

            Scanner sc= new Scanner(System.in);
            System.out.println("enter the value of n and r respectively ");
            int n = sc.nextInt();
            int r = sc.nextInt();

            int binomialcofficient = BINOCOFF(n,r);
            
             System.out.println( " the binomial coefficient is "+ binomialcofficient);

             sc.close();
        
        }
    
}
