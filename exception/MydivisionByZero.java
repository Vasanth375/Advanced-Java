package exception;

public class ArithmeticException extends Exception {

    public void Error(String Message) {
        String msg = Message;
    }
}

public class MydivisionByZero {
    public static void main(String[] args) {
        try {
            System.out.println(10/0);
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
