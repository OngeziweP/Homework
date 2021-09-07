
import java.util.Scanner;


public class factorial {

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
    while(true){
        String mess="\n Enter Positive integer please";
        System.out.println(mess);
        String s=scan.next();
        int n=Integer.parseInt(s);
       if(((s.isEmpty()==false)&&(n>=0))==true)
       {
        n=Integer.parseInt(s);
        int i=factIte(n);
        int r=factRec(n);
        String ms="factorial of "+n+" iterative is  "+i+", recursive is "+r+" ";
        System.out.println(ms);
    }
    }
      
 }

    
}
     
   
    
    

