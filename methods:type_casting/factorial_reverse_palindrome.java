public class factorial_reverse_palindrome{
    public static void fact(int a){
        int factorial=1;
        if(a==0)
            System.out.println("1");
        else
        { while(a!=0){
                factorial=a*factorial;
                a--;
            }
        System.out.println(factorial);
        }
    }

    public static void reverse(int num){
        while(num>0)
        {
            int rem = num%10;
            num=num/10;
            System.out.print(rem);
        }
        System.out.println();

    }

    public static void palindrome(int num){
        {
        System.out.print(num);
        int temp=num;
        int rev = 0;
        while(num>0)
        {
            int rem = num%10;
            rev = rev*10+rem;
            num=num/10;
        }
        if(temp == rev)
            System.out.println(" is a Palindrome");
        else
            System.out.println(" is not a Palindrome");
    }

    
    }
    public static void main(String[] args) {
        fact(5);
        reverse(432);
        palindrome(5005);
    }
}