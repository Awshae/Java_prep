import java.util.HashMap;

public class hashmap{
    public static void main(String[] args) {
        
    HashMap h = new HashMap();
    h.put(1, "ok");
    h.put(null, "ok");
    h.put('a', 100);
    h.put('b', null);
    h.put(2, '2');
    h.put(1, "haai");

    System.out.println(h);
    System.out.println(h.get(1));
    }
}