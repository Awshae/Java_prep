public class factorial{
    public static void main(String [] args){
        int a=5;
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
}
    

