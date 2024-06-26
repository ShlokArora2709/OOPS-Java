public class thread_states implements Runnable{
    public static Thread thread1;
    public static thread_states obj;

    public static void main(String[] args) {
        obj=new thread_states();
        thread1=new Thread(new thread());
        System.out.println("State of Thread1 after creating it - "+thread1.getState());
        thread1.start();
        System.out.println("State of Thread1 after calling start() method on it - "+thread1.getState());
        thread1.run();
    }
    public void run(){
        thread mythread=new thread();
        Thread thread2=new Thread(mythread);

        System.out.println("State of Thread2 after creating it - "+thread2.getState());
        thread2.start();

        System.out.println("State of Thread2 after calling start() method on it - "+thread2.getState());
        try{
            Thread.sleep(200);
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
        System.out.println("State of Thread2 after calling sleep() method on it - "+thread2.getState());
        try{
            thread2.join();
        }
        catch(InterruptedException e){
            System.out.println(e);
        
        }
        System.out.println("State of Thread2 when it has finished it's execution - "+thread2.getState());
        
    }

}

class thread implements Runnable{
    public void run(){
        try{
        Thread.sleep(1500);
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
        System.out.println("State of Thread1 while it called join() method on thread2-"+thread_states.thread1.getState());
        try{
            Thread.sleep(200);
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
    }
}