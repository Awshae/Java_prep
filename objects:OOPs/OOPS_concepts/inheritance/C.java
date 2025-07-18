public class C extends B{
    static int c = 24;
    public static void main(String[] args) {
    System.out.println(c);
    System.out.println(a); //inheritance, C takes stuff from B, which takes stuff from A
    System.out.println(b);
    System.out.println();
    System.out.println(C.c);
    System.out.println(C.a); 
    System.out.println(C.b);

}
}