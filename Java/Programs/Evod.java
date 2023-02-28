package Programs;

import java.util.Scanner;

public class Evod {
    static int[] ar = new int[5];  
    static int even, odd; 
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            for(int i=0; i<5; i++){
                System.out.print("Enter the number: ");
                int k = sc.nextInt();
                ar[i] = k;

                if(k%2 == 0){
                    even++;
                }
                else{
                    odd++;
                }
            }
            for(int i=0; i<5; i++){
                System.out.println(ar[i]);
            }
            System.out.println(even);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
