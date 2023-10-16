
package lab_work2;

public class Check_Odd_Number {
public void Checknumber(int number)throws ArithmeticException
{
 if (number % 2 == 0) {
  throw new ArithmeticException("Entered Number is even");
    }
else {
    System.out.println("Entered Number is odd");
}
}
}

