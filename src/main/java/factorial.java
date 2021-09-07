
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lusanda
 */
public class factorial {

    /**
     * @param args the command line arguments
     */
    

 
 static Scanner scan = new Scanner (System.in);
    
 public static int factIte(int n1){
     int  r = 1;
     if (n1>=0){
      for(int i =1; i<=n1; i++){
          r= r*i;
      }
     }
     return r;
}
 public static int factRec(int n1){
      int r =0 ;
     if (n1>=0){
         if ((n1==0)|| (n1==1)){
         r= 1;
        }
         else{
           r = (n1 * factRec(n1-1));
         } 
     }
     return r;
 }
 
 public static void main (String[]args){
    int fact;
    fact = scan.nextInt();
    int number;
    number = factIte(fact);
    int number2 = factRec(fact);
     for (int i = 1; i<= number2;i++){
         fact= fact*i;   
     }
    System.out.println("factorial of "+ number2 + " is " + fact);
      
 }

    
}
     
   
    
    

