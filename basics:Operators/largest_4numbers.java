public class largest_4numbers{
    public static void main(String[] args) {
        int a,b,c;
        a = 10;
        b = 12;
        c = 5;
        boolean d = a>b && a>c;
        boolean e = b>c && b>a;
        boolean f = c>a && c>b;
        System.out.println("is a the largest? " +d);
        System.out.println("is b the largest? " +e);
        System.out.println("is c the largest? "+f);
    }
}
