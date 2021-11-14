package String;
public class Ascii {
    int arr[];
    public static void main(String[] args) {
        Ascii obj = new Ascii();
        obj.arr = new int[128];
        for(int i=0;i<obj.arr.length;i++)
        {
            obj.arr[i]=i;
        }
        for(int i:obj.arr)
        {
            System.out.print((char)i+" ");
        }
    }
}
