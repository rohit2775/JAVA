package basicpatterns;

public class characterpattern {
    
    public static void main (){

        int n = 5;
        char ch = 'A';


     for(int i =1 ; i<=n;i++){
               
         for(int chars=1 ; chars<=i ; chars++){

            System.out.print(ch + " ");
            ch++;

         }
         System.out.println();

     }
        
    }
}




// A 
// B C 
// D E F 
// G H I J 
// K L M N O 
