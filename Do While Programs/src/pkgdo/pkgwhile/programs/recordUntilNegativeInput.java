
package pkgdo.pkgwhile.programs;

import java.util.Scanner;


public class recordUntilNegativeInput {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        int x=0,sum=0;
        float avrg,a;
        System.out.println("enter a number : ");
        
        a=input.nextFloat();
        
        do 
        {
            
            x++;
            sum=sum+x;
            a=input.nextFloat();
    } while (a>0);
        
        avrg=(float)sum/x;
        System.out.println("\n\n");
        System.out.println("total number : "+x+" \n sum : " +sum+"\n avrg :" +avrg);
    }
    
}
