public class method_intro{

    //Can make multiple methods in a class block, should be outside the public static void main, method cannot be made IN a method.  
    //no argument method
    public static void meth()
        {
            System.out.println("Helo");
            crack(); //method within a method
        }
    public static void crack()
        {
            System.out.println("Hai");
        }
    //parametric method
    public static void addd(int a,int b){
        int c = a+b;
        System.out.println(c);
    }

    public static void main(String [] args)
    {
        meth();
        System.err.println();
        System.out.println("The sum of numbers are");
        addd(4,3);
    }
}