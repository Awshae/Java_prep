import java.util.ArrayList;
public class collection{
//progrma to create generic and non generic collection
    public static void main(String[] args) {
        System.out.println("------GENERIC COLLECTION-------");
        ArrayList<Integer> a1=new ArrayList();
        a1.add(10);
        a1.add(20);
        a1.add(10);
        a1.add(20);
        System.out.println(a1);
        System.out.println("-----------");

        System.out.println("------NON-GENERIC COLLECTION-------");
        ArrayList a2 = new ArrayList();
        a2.add(10);
        a2.add(10.2);
        a2.add("OKAY");
        a2.add('g');
        a2.add(10);
        a2.add(20);
        System.out.println(a2);
        System.out.println("-----------");
    }
}