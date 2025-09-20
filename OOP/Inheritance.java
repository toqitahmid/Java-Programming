class Player{

    String name;
    int age;

    Player(String name, int age){

        this.name = name;
        this.age = age;
    }

    public void getPlayerInfo(){

        System.out.println(this.name);
        System.out.println(this.age+" years old");
    }
}

class Cricketer extends Player{

    int centuries;
    Cricketer(String name, int age, int centuries){

        super(name, age);
        this.centuries = centuries;
    }

    public void getCricketerInfo(){

        super.getPlayerInfo();
        System.out.println("Number of centuries : " + centuries);
    }
}

class Footboller extends Player{
     
    int goals;
    Footboller(String name, int age, int goals){

        super(name, age);
        this.goals = goals;
    }

    public void getFootbollerInfo(){

        super.getPlayerInfo();
        System.out.println("Number of goals : " + goals);
    }
}

public class Inheritance {

    public static void main(String args[]){

        Cricketer cricketer;
        cricketer = new Cricketer("Sakib",37,20);

        Footboller footboller;
        footboller = new Footboller("Hamza", 30, 20);
        
        System.out.println();
        cricketer.getCricketerInfo();
        System.out.println();
        footboller.getFootbollerInfo();
        
    }
}