package String;
import java.util.*;
public class Add {
    static int sum=0;
    public static void main(String[] args) {
        System.out.println("Enter the size of the array : ");
        Scanner s = new Scanner(System.in);
        int size = s.nextInt(),pos6=-1,pos7=-1,extraSum=0;
        int arr[] = new int[size];
        System.out.println("Enter the unique array elements : ");
        for(int i=0;i<size;i++)
        {
            System.out.println("Enter the "+i+"-th element : ");
            arr[i] = s.nextInt();
            if(arr[i]==6)
                pos6=i;
           else if(arr[i]==7)
               pos7=i;
           sum= sum+arr[i];
        }
        if(pos6<pos7 && pos6!=0 && pos7!=0)
        {
            for(int i=pos6;i<=pos7;i++)
                extraSum=extraSum+arr[i];
        }
        System.out.println("Required sum : "+(sum-extraSum));
    }
}
