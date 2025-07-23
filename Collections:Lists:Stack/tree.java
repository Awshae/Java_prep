import java.util.Scanner;
import java.util.TreeSet;

public class tree{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = s.nextInt();

        TreeSet<Integer> t=new TreeSet();
        System.out.println("Enter Values");

        for (int i = 0; i < size; i++) {
            t.add(s.nextInt());
        }

        for(Integer i: t)
            System.out.println(i+" ");
    }
}