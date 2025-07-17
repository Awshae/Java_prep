public class even_odd{
    public static void odd(int a, int b){
        for(int i=a;i<=b; i++){
            if(i%2!=0)
                System.out.println(i);
        }
    }
    public static void even(int a, int b){
        for(int i=a;i<=b; i++){
            if(i%2==0)
                System.out.println(i);
        }
    }
    public static void main(String[] args) {
        System.out.println("Odd numbers are");
        odd(1,10);
        System.out.println("Even numbers are");
        even(1,10);
    }
}