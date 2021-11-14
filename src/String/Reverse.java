package String;
public class Reverse {
    public static void main(String[] args) {
        if(args.length!=4){
            System.out.println("Please enter the 4 integer numbers");
        }
        else
        {
            System.out.println("The given array is : ");
            for(int i=0;i< args.length;i++){
                if(i%2==0 && i<args.length-1)
                    System.out.println();
                System.out.print(args[i]+" ");
            }
            System.out.println("\nThe reverse of the array is : ");
            for(int i= args.length-1;i>=0;i--){
                if(i== args.length-3)
                    System.out.println();
                System.out.print(args[i]+" ");
        }
        }
    }
}
