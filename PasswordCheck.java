
package Lab_work;
import java.util.Scanner;
public class PasswordCheck {

        public static void main(String[]args){
        int length;
        int whitespace=0;
        int digits=0;
        int letters=0;
        System.out.println("Enter the Password : ");
        Scanner t = new Scanner(System.in);
        String password = t.nextLine();
        length=password.length();
        if(length>10){
            for(int i=0;i<length;i++){
                char ch = password.charAt(i);
                if(!Character.isLetter(ch)&&
                   !Character.isWhitespace(ch)&&
                   !Character.isDigit(ch)){
                    break;
                }
                else{
                    if(Character.isDigit(ch)){
                    digits++;
                }
                    else if(Character.isWhitespace(ch)){
                    whitespace++;
                }
                    else if(Character.isLetter(ch)){
                    letters++;
                }
                }
            }
        }
        if(length>10&&digits>=2&&whitespace>=1&&letters>=1){
            System.out.println("Password is valid");
        }
        else{
            System.out.println("Password is not valid");
        }
            }
}




