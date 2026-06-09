class Student {
    int Roll;

    Student(int roll) {
        Roll = roll;
    }
    
    Student(Student s){
        Roll = s.Roll;
    }

    void Display () {
        System.out.println("Roll:"+ Roll);
    }
    
}
public class CopyConstructor {
    public static void main(String[] args) {
        Student s = new Student(100);
        s.Display();
        Student s2 = new Student(s);
        s2.Display();

    }
}
