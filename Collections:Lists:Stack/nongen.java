
import java.util.ArrayList;
import java.util.Scanner;

public class nongen{
//program to print student details using array list indexing
    public static void main(String[] args){
        ArrayList a = new ArrayList();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Size");
        int size = s.nextInt();

        int m = 1;
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the "+m+" Student name");
            a.add(s.next());
            System.out.println("Enter the "+m+" Student mob no");
            a.add(s.nextInt());
            m++;
        }
        System.out.println();
        System.out.println("=========DETAILS=============");
        int n = 1;
        for (int i = 0; i <a.size(); i++) {
            System.out.println(n+" Student name: "+a.get(i++));
            System.out.println(n+" Student mob no: "+a.get(i));
            System.out.println();
            n++;
        }
    }
}