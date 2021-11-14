package String;
import java.util.*;
public class Array {
    int arr[];
    static int flag = 0;
    public static void main(String[] args) {
        Array obj = new Array();
        obj.arr = new int[5];
        obj.arr[0]=21;
        obj.arr[1]=67;
        obj.arr[2]=212;
        obj.arr[3]=1050;
        obj.arr[4]=69;
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        for(int i=0;i<obj.arr.length;i++)
        {
            if(obj.arr[i]==num)
            {
                flag=1;
                System.out.println(i);
            }
        }
        if(flag==0)
            System.out.println(-1);
    }
}
