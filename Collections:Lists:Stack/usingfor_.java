import java.util.ArrayList;
import java.util.Scanner;

public class usingfor_{
//program using for each.
      public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList a = new ArrayList();
        System.out.println("Enter size");
        int size = s.nextInt();

        System.out.println("Enter the values");
        for(int i =0; i<size ; i++){
            a.add(s.nextInt());
        }

        a.add('a');
        a.add("ok");
        System.out.println("Using for Each");
        for (Object i : a) 
        {
            System.out.println(i);
        }
    }
}