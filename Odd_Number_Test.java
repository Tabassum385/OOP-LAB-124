
package lab_work2;

import java.util.Scanner;

public class Odd_Number_Test {
    public static void main(String[] args) {
        Check_Odd_Number obj = new  Check_Odd_Number();
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("The number is: ");
        n=input.nextInt();
        
        obj.Checknumber(n);
    }
    
}
