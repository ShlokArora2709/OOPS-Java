//Polymorphism allows us to perform a single action in different ways. 
//In other words, polymorphism allows you to define one interface and 
//have multiple implementations.


//Compile-time/Static Polymorphism ->
//Method overloading

class Method_Overloading{
    static int add(int a,int b){
        return a+b;
    }

    static double add(double a,double b){
        return a+b;
    }

    static int add(int a, int b, int c){
        return a+b+c;
    }
}

//Runtime/Dynamic Polymorphism->
//Method Overriding
class Method_Overriding_Parent{
    void Print(){
        System.out.println("Parent Class");
    }
}
class Method_Overriding_Child extends Method_Overriding_Parent{
    void Print(){
        System.out.println("Child Class");
    }
}



class Polymorphism{
    public static void main(String[] args){
        //Method overloading Output
        System.out.println(Method_Overloading.add(4, 5));
        System.out.println(Method_Overloading.add(7.3, 63.4));
        System.out.println(Method_Overloading.add(4, 6,3)+"\n");

        //Method Overriding Output
        Method_Overriding_Parent P= new Method_Overriding_Child();
        P.Print();


    }
}