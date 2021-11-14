package Constructor;

class Stu {
    String name;
    float per;
    Stu(String name, float per){
        this.name=name;
        this.per=per;
    }
}
public class Test{
    public static void main(String[] args) {
        Stu obj1 = new Stu("Sachin",90.45f), obj2 = new Stu("Rajiv",89.78f), obj3 = new Stu("Sanjeev",92.60f);
        if(obj1.per>obj2.per && obj1.per>obj3.per)
            System.out.println(obj1.name);
        else if(obj2.per>obj1.per && obj2.per>obj3.per)
            System.out.println(obj2.name);
        else
            System.out.println(obj3.name+" : "+obj3.per);
    }
}
