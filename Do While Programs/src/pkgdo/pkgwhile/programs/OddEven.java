
package pkgdo.pkgwhile.programs;

import java.util.Scanner;


public class OddEven {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int i=0,a,b;
        System.out.println("How many Numbers:");
            b = input.nextInt();
        do{
            System.out.println("enter the value = ");
            a = input.nextInt();
            if(a%2==0)
            {
                System.out.println("even");
            }
            else
            {
                System.out.println("odd");
            }
            i++;
        }while(i<=b-1); 
    }
    
}
