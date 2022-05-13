package Threads;

// runnable Interface is a way to create threads in java
public class RunnableInterface implements Runnable{
    public void run(){
        System.out.println("Interface is on");
    }

    public static void main(String[] args) {
        Thread tn = new Thread(new RunnableInterface());
        tn.start();
    }
}


