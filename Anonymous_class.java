public class Anonymous_class{
    public static void main(String[] args) {
        Child C= new Child(){
            @Override 
            public void eat(){
                System.out.println("Child eats");
            }
        };
        C.eat();
    }
}
interface Child{
    void eat();
}
