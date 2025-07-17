public class C{
    //basic program to understand block working
    static int a=hai();
    static int b =20;
    public static int hai()
    {
        System.out.println("Hai method begin");
        System.out.println(a);
        System.out.println(b);
        System.out.println("Hai method end");
        return 10;
    }
    public static void main(String[] args) 
    {
        System.out.println("main method begin");
        System.out.println(a);
        System.out.println(b);
        System.out.println("main method end");     
    }
}