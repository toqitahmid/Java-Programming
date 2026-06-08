class Student{
    int cal(int x, int y){
        int z = x+y;
        return  z;
    }
    float cal(float x, float y){
        float z = x+y;
        return  z;
    }
    void cal(String name){
        System.out.println("Semester: "+name);
    }
}

public class MethodOverloading{
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println("Total students:"+ s.cal(10, 20));
        System.out.println("Total CGPA:"+ s.cal(2.0f, 1.5f));
        s.cal("5th");
    }
}