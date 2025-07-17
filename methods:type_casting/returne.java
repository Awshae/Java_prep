public class returne{
    public static int add2(int a, int b)
    {
        int c = a+b;
        System.out.println(c);
        return c;
    }
    public static int add3(int a, int b, int c)
    {
        int d = a+b+c;
        System.out.println(d);
        return d;
    }
    public static void main(String[] args) {
        int a = add2(10,20);
        int b = add3(10, 10, 20);
        int res = a+b;
        System.out.println(res);
    }

}