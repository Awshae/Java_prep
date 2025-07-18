//sub class static area, super calls outside class. sub class can be directly
//sub class- super and sub
//B is sub class and it inherits stuff from A
public class B extends A{
    static int b = 20;
    int d = 40; //non-static member
public static void main(String[] args) {
    System.out.println(a); //inheritance, B takes stuff from A
    System.out.println(b);
    System.out.println(a);
    System.out.println(B.b);
    System.out.println(B.a);
    // System.out.println(B.d); wont work because d is a non static int.
}
}