import java.util.Scanner;
import java.util.ArrayList;
public class toArray{
//Program to convert collection to array
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList();

        System.out.println("Enter the size");
        int size = s.nextInt();

        System.out.println("Enter the values");
        for(int i =0; i<size ; i++){
            a.add(s.nextInt());
        }

        System.out.println("Collection to Array");
        Object i[] = a.toArray();
        for (int j = 0; j < i.length; j++) 
        {
            System.out.println(i[j]);
        }
    }

}

