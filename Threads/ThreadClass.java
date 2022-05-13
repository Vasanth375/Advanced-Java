package Threads;
// import java.lang.Thread;
class X extends Thread
{
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("X class"+i);
        }
    }
}

public class ThreadClass extends Thread {
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread class"+i);
        }
    }
    public static void main(String[] args) {
        ThreadClass tc = new ThreadClass();
        X tx = new X();
        tc.start();
        tx.start();
        System.out.println(tc.getPriority()-4);
        System.out.println(tx.getPriority()+5);
        try{
            tc.join();
            tx.join();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
