import java.util.Scanner;
import java.util.TreeMap;

public class Treemap{
    public static void main(String[] args) {
    
    TreeMap<Integer,String> h = new TreeMap();
    Scanner s= new Scanner(System.in);
    System.out.println("Enter the size");
    int size = s.nextInt();

    System.out.println("Enter Keys and Values");
    for (int i = 0; i < size; i++) {
        h.put(s.nextInt(), s.next());
    }
    System.out.println(h);
    }
}