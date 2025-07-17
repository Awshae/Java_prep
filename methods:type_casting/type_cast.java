//type casting - wideinging and narrowing.
/*   1     boolean
     1     byte
     2     char, short
     4     float, int
     8     long
     16    double
     8     string*/

public class type_cast{
    public static void main(String[] args) {

        System.out.println("Widening");
        char c ='a';
        int a = c;
        double d=a;
        System.out.println(c);
        System.out.println(a);
        System.out.println(d);
        System.out.println("Narrowing");

        double d1 = 100.11;
        int a1 = (int) d1;
        char c1 = (char)a1;
        //string s = "ok";
        //char c2 = (char)s is not possible
        System.out.println(d1);
        System.out.println(a1);
        System.out.println(c1);

    }
}