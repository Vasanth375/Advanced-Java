
/// Arrays are collection similar datatypes, size is fixed not extended at runtime.
/*
* Three types of arrays are
* 1.single
* 2.multi
* 3.jagged
* */
public class Main {

    int[] array = new int[10];   //single array declaration

    // method used to initialize array
    void initialize()
    {
        for (int i = 0; i < array.length; i++) {
            array[i]=i+1;
        }
    }

    // method
    void printArray()
    {
        for (int i : array) {
            System.out.print(i+", ");
        }
        System.out.println();
    }
    int sumArray()
    {
        int sum=0;
        for (int i :
                array) {
            sum=sum+i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Main m = new Main();
        m.initialize();
        m.printArray();
        System.out.println(m.sumArray());
    }
}