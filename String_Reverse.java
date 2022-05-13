
public class Main {
    String name ;
    String revString = "";

    Main(String name)
    {
        this.name = name;
    }

    void palindrome()
    {
        for (int i = name.length() - 1 ; i>=0; i--)
        {
            revString = revString + name.charAt(i);
        }
        if(revString.equals(name))
        {
            System.out.println(revString+" is Same");
        }
        else
        {
            System.out.println(revString+" is Not same");
        }
    }
    public static void main(String[] args) {
        Main m = new Main("radar");
        m.palindrome();
    }
}
