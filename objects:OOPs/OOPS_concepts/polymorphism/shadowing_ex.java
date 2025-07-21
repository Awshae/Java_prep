public class shadowing_ex extends shadowingg{
    /*
    public static void test()
    {
        System.out.println("Testing 234");
        System.out.println();
    }
    */
    public void test()
    {
        System.out.println("Testing 234");
        System.out.println();
    }

    public static void main(String[] args)
    {
        shadowingg ob1 = new shadowingg();
        ob1.test();

        shadowing_ex ob2 = new shadowing_ex();
        ob2.test();

        shadowingg ob3 = new shadowing_ex(); //upcasting
        ob3.test();

        shadowingg ob4 = new shadowingg(); //down-casting
        ob4.test();
    }
}