public class fib{
    public static void main(String[] args){
        int a=0,b=1,i=1;
        while(i<=10){
            int c = a+b;
            System.out.println(c);
            a=b;
            b=c;
            i++;
        }
    }
}
