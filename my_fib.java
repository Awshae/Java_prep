public class my_fib{
    public static void main(String[] args){
        int a=0,b=1,num=10,sum=0;
        for (int i = 0; i <= num; i++) {
            System.out.println(sum);
            a=sum;
            sum=a+b;
            b=a;
        }
    System.out.println(sum);
    }
}
