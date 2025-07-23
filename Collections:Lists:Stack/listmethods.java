import java.util.ArrayList;
public class listmethods{
//program to see non-generic list
    public static void main(String[] args){
        ArrayList a = new ArrayList();
        System.out.println(a.size());
        System.out.println(a.isEmpty());
        System.out.println("-----------");
        a.add(10);
        a.add(10.13);
        a.add('a');
        a.add("ok");
        a.add(10);
        a.add(7.5);
        System.out.println(a.size());
        System.out.println(a);
        a.removeAll(a);
        System.out.println(a);
        System.out.println("-----------");
    }
}