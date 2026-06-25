 package basics;

 public class reverse2 {
 
     public static void main (){

        int num =345678;

        int reverse=0;

        while (num >0){
           int lastdigit = num%10;
           reverse = (reverse * 10) + lastdigit;
            num/=10;


        }
        System.err.println(reverse);
        
     }
 }




// logic yaad rakhna hai 
