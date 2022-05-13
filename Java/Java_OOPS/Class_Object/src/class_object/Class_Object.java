/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package class_object;

/**
 *
 * @author VASANTH
 */
public class Class_Object {
//defination of class name with Class_Object
    /**
     * @param args the command line arguments
     */
    // Instance variables allocated heap memory at runtime(when Object creation)
    int a;
    void show()
    {
        System.out.println("Hello, world");
    }
   
    public static void main(String[] args) {
        //object creation at runtime
        //object created by reference called object
        Class_Object obj = new Class_Object();
        
        obj.show();  //calling the object
        
        new Class_Object().show();  //anonymous object which does't have any reference
        //it is used by once only   
                
    }
}
