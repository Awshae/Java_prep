public class char_at{

public static void main(String[] args) {
    System.out.println("String to Character");
    String s1 = "NMAMIT";
    System.out.println(s1);

    System.out.println("Using charAt() at index 0");
    
    System.out.println(s1.charAt(0));

    System.out.println("Using for loop for all elements");
    for (int i = 0; i < s1.length(); i++) {
        System.out.println(s1.charAt(i));
    }
}
}
