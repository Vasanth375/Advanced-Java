package single_inheritance;
/**
 *
 * @author VASANTH
 */
import java.util.Scanner;
//Parent Class
class ParentClass
{
    int a;
    int b;
    int c;
}

//Sub Class
class SubClass extends ParentClass
{
    void initialize()
    {
        Scanner Sobj = new Scanner(System.in);
        System.out.println("Enter the value of A");
        a=Sobj.nextInt();
        System.out.println("Enter the value of B");
        b=Sobj.nextInt();
    }
    void add()
    {
        c=a+b;
    }
    void show()
    {
        System.out.print("Value of c : ");
        System.out.println(c);
    }
}
public class Single_Inheritance {
    public static void main(String[] args) {
        SubClass SC = new SubClass();
        SC.initialize();
        SC.add();
        SC.show();
    }
}
