package JavaOverloading;

/**
 * Overloading
 */
public class Overloading {

    public static int add(int a, int b) {
        return a+b;
    }
    public static int add(int a, int b, int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        System.out.println(Overloading.add(1, 2));
        System.out.println(add(1, 2, 3));
    }
}
