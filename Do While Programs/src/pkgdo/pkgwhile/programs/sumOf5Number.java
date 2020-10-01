
package pkgdo.pkgwhile.programs;

import java.util.Scanner;


public class sumOf5Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i=0,a,sum=0;
        do
        {
            System.out.println("Enter Next value : ");
            a = input.nextInt();
            sum = sum + a;
            i++;
            
        }
       
        while(i<=5);
        System.out.println("sum ="+sum);
    }
    
}
