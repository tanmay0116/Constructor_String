package String;
import java.util.*;
public class Palindrome {
    String num1;
    static int flag = 0;
    public static void main(String[] args) {
        Palindrome obj = new Palindrome();
        Scanner s = new Scanner(System.in);
        obj.num1 = s.nextLine();
        for(int i=0,j=obj.num1.length()-1;i<j;i++,j--)
        {
            if(obj.num1.charAt(i)!=obj.num1.charAt(j))
            {
                flag = 1;
                break;
            }
        }
        if(flag==1)
            System.out.println("Entered number is not palindrome");
        else
            System.out.println("Entered number is palindrome");
    }
}

