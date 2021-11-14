package Constructor;

public class Student {
    String studentName;
    Student(String studentName)
    {
        this.studentName=studentName;
    }
    Student(){
        studentName="Unknown";
    }
    public static void main(String[] args) {
        Student obj1 = new Student();
        Student obj2 = new Student("Saatvik");
        System.out.println(obj1.studentName+"\n"+obj2.studentName);
    }
}
