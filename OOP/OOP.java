class Student{

    String name;
    int cls;
    int id;

    Student(String name, int cls, int id){

        this.name = name;
        this.cls = cls;
        this.id = id;
    }

    void studentInfo(){

        System.out.println("Student's Name : "+this.name );
        System.out.println("Student's Class : "+this.cls );
        System.out.println("Student's ID : "+this.id);
    }

}

public class OOP {

    public static void main(String args[]){

        Student student1;
        student1 = new Student("Araf", 12, 856294);
        student1.studentInfo();

        
        
    }
}