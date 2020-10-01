
package pkgdo.pkgwhile.programs;


public class TotalNumberOddEvenSum {
    public static void main(String[] args) {
        int i=1,o=0,e = 0,so=0,se=0;
        do 
        {
            if(i%2==0)
            {
                e++;
                se=se+e;
            }
            else
            {
                o++;
                so=so+o;
            }
            i++;
        }while(i<=100);
        System.out.println("Total Even Number: "+e+"\nSum of Even Number: "+se+"\nTotal Odd Number: "+o+"\nSum of Odd Number: "+so);
        
    }
    
}
