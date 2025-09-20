class Student{

    String name;
    int cls;
    int id;
    double cg;

    Student(String name, int id, double cg){

        this.name = name;
        this.id = id;
        this.cg = cg;
    }

    public void printInfo(String name){

        System.out.println(this.name);
    }
    public void printInfo(int id){

        System.out.println(this.id);
    }
    public void printInfo(double cg){

        System.out.println(this.cg);
    }
}

public class Polymorphism {

    public static void main(String args[]){

        Student student1;
        student1 = new Student("Araf", 856294, 4.54);
        student1.printInfo(student1.name);
        student1.printInfo(student1.id);
        student1.printInfo(student1.cg);
    }
}