interface Child{
    final int age=10;
    void studies();
}

class student implements Child{
    // making a studies() method is compulsory as it implements child interface
    public void studies(){
        System.out.println("The student studies");
    }
}

//multiple inheritence using interfaces
interface footballer{
    void plays();
}
class boy implements footballer,Child{
    public void studies(){
        System.out.println("Boy Studies");
    }
    public void plays(){
        System.out.println("boy plays football");
    }
}


//abstract classes
abstract class shape{
    //A abstract class can have-
    shape(){ //Constructor
        System.out.println("Shape Created");
    }
    void area(){//non abstract methods
        System.out.println("Every shape has area");
    }
    int colour;
    abstract void draw();//abstract methods

    static void peri(){//static methods
        System.out.println("Shapes perimeter");
    }
}
class Circle extends shape{
    public void draw(){
        System.out.println("Drawing Circle");
    }
}

public class interfaceAbstraction {
    public static void main(String[] args) {
        student ram=new student();
        ram.studies();

        boy sham=new boy();
        sham.plays();
        sham.studies();

        //abstract class cannot have a instance but can be referenced
        shape c1 = new Circle();
      //refrencing   //instance of circle class
        // obj is of circle class not shape
        c1.draw();

        shape.peri();// static methods can be called without object
    }
}
