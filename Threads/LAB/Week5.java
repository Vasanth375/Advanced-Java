import java.util.Random;

class Even extends Thread{
    int k=0;
    Even(int i){
        k = i;
    }
    public void run(){
        System.out.println("Even Thread: Square of even number - "+ (k*k));
    }
}
class Odd extends Thread{
    int k=0;
    Odd(int i){
        k = i;
    }
    public void run(){
        System.out.println("Odd Thread: Cube of Odd number - "+ (k*k*k));
    }
}

public class Main extends Thread{
	Random r = new Random();
	
    public void run(){
        for(int i = 0; i<3; i++){
            int randValue = r.nextInt(5);
            System.out.println("Randomly Generated Value: "+randValue);
            if(randValue%2 == 0){
        	    Even e = new Even(randValue);
                e.start();
            }
            else
	        {
                Odd o = new Odd(randValue);
                o.start();
            }
            
            try {
                Thread.sleep(1000);
            } catch(Exception e) {}
        }
    }
    public static void main (String[] args) {
        Main t1 = new Main();
    	t1.start();
    }
}
