import java.util.ArrayList;
import java.util.Scanner;

public class indexx{
//using index to iterate
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList();
        System.out.println("Enter size");
        int size = s.nextInt();

        System.out.println("Enter the values");
        for(int i =0; i<size ; i++){
            a.add(s.nextInt());
        }

        System.out.println("Using Index");
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }
    }
}