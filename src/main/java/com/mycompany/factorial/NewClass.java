/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.factorial;

/**
 *
 * @author Lusanda
 */
import java.util.*;
public class NewClass {
 
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
           r = (n1 * factRec (n1-1));
         } 
     }
     return r;
 }
 
 public static void main (String[]args){
    int fact =1;
    int number = 5;
    int i;
     for (i = 1; i<=number;i++){
         fact= fact*i;
         
     }
    System.out.println("factorial of +number is" + fact);
    
     int i1;
     double fact1=1;
     double number1 =4;
     fact = (int) factIte((int) number1);
     System.out.println("factorial of number1 is"+fact1);
     
  
     int num =5;
     System.out.println("ternary ooperator factorial of" + num + "is" + factIte(num));
     int numbers;
     System.out.println("Enter the number");
     Scanner scan = new Scanner(System.in);
     number = scan.nextInt();
     scan.close();
     long fact2 =1;
     int i2 = 1;
     while(i<=number)
     {
         fact = fact*i;
         i++;
     }
     System.out.println("factorial of number is" + fact);
    
    
 }

    
}
     
       
       
       
       
       