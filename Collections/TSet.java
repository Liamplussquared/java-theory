import java.util.*; 
public class TSet { 
    public static void main(String args[]) { 
        TreeSet<String> ts  = new TreeSet<String>(); 

        ts.add("Hello");
        ts.add("there");
        ts.add("!");

        System.out.println(ts);
    } 
}