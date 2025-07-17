public class B
{   //basic program to intertwine methods from two different classes. Note: keep in same folder structure
    static int a;
    public static void hi()
    {
        System.out.println("hello");
    }
static {
    System.out.println("Static Block");
}
public static void main(String[] args)
{
    int a = 10;
    hi();
    A.add2(4, 5);
    System.out.println(a);
}
}