public class Student {

    String Name;
    int ID;
    int Semester;
    double CG;

    public Student(String name, int id, int sem, double cg) {
        Name = name;
        ID = id;
        Semester = sem;
        CG = cg;
    }

    public void Show() {
        System.out.println("Student's Name: " + Name);
        System.out.println("Student's ID: " + ID);
        System.out.println("Student's Sementer: " + Semester);
        System.out.println("Student's CG: " + CG);
    }

    public static void main(String[] args) {
        Student s = new Student("Araf", 856294, 4, 3.43);
        s.Show();
    }
}

