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

        System.out.println(this.name);
        System.out.println(this.cls);
        System.out.println(this.id);
    }
}

public class Constructor {

    public static void main(String args[]){

        Student student1;
        student1 = new Student("Araf",12,856294);

        Student student2;
        student2 = new Student("Jannat", 12, 856290);

        student1.studentInfo();
        System.out.println();
        student2.studentInfo();
    }
}