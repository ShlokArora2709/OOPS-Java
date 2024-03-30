public class ExceptionHandling {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        try{
            System.out.println(a/b);
        }
        //catch(ArithmeticException e){
            //System.out.println(e);
        //}
        catch(NullPointerException e){
            System.out.println(e);
        }
        finally{
            System.out.println("Finally block is always executed"); 
//if a error occurs but it is not catched, finally block will be executed but not the rest of the code
        }

        
        System.out.println("Code executed");
    }
}
/*
class TestThrows{
    static void m() throws IOException{
        throw new IOException("Device error");//checed exception
    }
    static void p(){
        try{
            m();
        }
        finally{

        }
    }
}
*/