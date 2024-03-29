public class Constructors {
    

    public static void main(String[] args) {
         // Using Default constructor
         Default obj1 = new Default();
        
         // Using Parameterized constructor
         Parameterized obj2 = new Parameterized("Shlok", 20);
         
         // Using CopyConstructor
         CopyConstructor original = new CopyConstructor("Hello", 25);
         CopyConstructor copy = new CopyConstructor(original);

    }
}
class Default{
    Default(){
        System.out.println("Default constructor called");

    }
}
class Parameterized{
    Parameterized(String name,int Age){
        System.out.println("My name is "+name+"and age is "+Age);
    }
}
//we can perform constructor overloading just like method over loading

class CopyConstructor{
    String name;
    int Age;
    CopyConstructor(String name,int Age){
        this.name=name;
        this.Age=Age;
        System.out.println("My name- "+name+"and age- "+Age);
    }
    CopyConstructor(CopyConstructor obj){
        System.out.println("My copy name- "+obj.name+"and copy age- "+obj.Age);
    }
}
