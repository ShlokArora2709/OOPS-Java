public class multithreading {
    public static void main(String[] args) {
        int n=8;
        for(int i=0;i<n;i++){
            Thread obj= new Thread(new threads());
            obj.start();
        }
    }
    
}
/* 
class threads extends Thread{
    public void run(){
    
        System.out.println("Thread"+Thread.currentThread().getId()+"is running");
        
    }
}
*/

class threads implements Runnable{
    public void run(){
    
        System.out.println("Thread"+Thread.currentThread().getId()+"is running");
        
    }
}
