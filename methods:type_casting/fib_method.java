public class fib_method{
    public static int fib(int a, int b)
    {
        int c=0,i=1,sum=0;
        while(i<=10)
        {
            c = a+b;
            sum = c+sum;
            System.out.println(c);
            a=b;
            b=c;
            i++;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(fib(0,1));
    }
}