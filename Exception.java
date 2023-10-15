
package lab_work2;


public class Exception {
    public static void main(String[] args)throws ArithmeticException{
       try{ 
        int a=10;
        int b=0;
        int result = a/b;
        System.out.println("Result :"+result);
  }
  catch(ArithmeticException e){
      System.out.println("Exception :"+e);
  }
}
    public static int result(int a, int b) {
        if(b==0){
        throw new ArithmeticException("Cannot divide a divided by b");
        }
        return a/b;
    }
    }