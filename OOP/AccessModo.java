
class Mode{

    public int x = 2;
    protected int y = 4;
    private int a = 6;

    int z = 1;

    void printMode(){

        System.out.println(x);
        System.out.println(y);
        System.out.println(a);
        System.out.println(z);
    }
}

class AccessModo {
    
    public static void main(String args[]){
        
        Mode state1;
        
        state1 = new Mode();
        // state1.printMode();
        

        
        System.out.println(state1.x);
        System.out.println(state1.y);
        // System.out.println(state1.a);
        System.out.println(state1.z);
    }
}