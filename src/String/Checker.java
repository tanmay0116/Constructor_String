package String;
import java.util.Scanner;
import java.util.*;
public class Checker {
    public static void main(String[] args) {
        System.out.println("Enter the size of the array : ");
        Scanner s = new Scanner(System.in);
        int size = s.nextInt(),flag=0;
        int arr[] = new int[size];
        System.out.println("Enter the unique array elements : ");
        for(int i=0;i<size;i++)
        {
            System.out.println("Enter the "+i+"-th element : ");
            arr[i] = s.nextInt();
            if(arr[i]!=1 && arr[i]!=4)
                flag=1;
        }
        if(flag==0)
            System.out.println("true");
        else
            System.out.println("false");
    }
}
