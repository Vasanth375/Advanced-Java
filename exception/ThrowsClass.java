package exception;

/**
 * ThrowsClass
 */
public class ThrowsClass {
    // throws is signature of the method
    // throws used to tell that this method might generates ArithmeticException, we can also write
    // exception seperated with comma(,)
    static String validate(int age) throws ArithmeticException{
        if (age > 18){
            return "You are eligible";
        }
        // used to throw exception manually
        throw new ArithmeticException("Not eligible");
    }
    public static void main(String[] args) {
        int age = 25;
        try{
            System.out.println(validate(age));
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}