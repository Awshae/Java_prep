import java.util.Scanner;
import java.util.ArrayList;
public class program{

//program to find key in arraylist.
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList();

        System.out.println("Enter the size");
        int size = s.nextInt();

        System.out.println("Enter the values");
        for(int i =0; i<size ; i++){
            a.add(s.nextInt());
        }

        System.out.println("Enter the Key");
        int key = s.nextInt();

        System.out.println("Entered Values are");
        for(int i =0; i<a.size() ; i++){
            System.out.println(a.get(i));
        }

        System.out.println("--------------");

        if(a.contains(key))
            System.out.println(key+" is Found");
        else
            System.out.println(key+" is not Found");
    }

}