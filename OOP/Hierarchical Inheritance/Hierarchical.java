class A{
    public void methodA(){
        System.out.println("Method of class A");
    }
}
class B extends A{
    public void methodB(){
        System.out.println("Method of class B");
    }
}
class C extends A{
    public void methodC(){
        System.out.println("Method of class C");
    }
}

public class Hierarchical {
    public static void main(String[] args) {
        A a = new A();
        A b = new A();
        A c = new A();
        
        a.methodA();
        b.methodA();
        c.methodA();
        
        System.out.println();
        
        B b1 = new B();
        C c1 = new C();
        
        System.out.println();
        
        b1.methodB();
        c1.methodC();
    }
}
