//method overload concept of polymorphism. Same name, different lenght or different type.
public class override
{   //same name | same type | diff length
    public static void add(int a,int b){
        int c = a+b;
        System.out.println(c);
    }
    public static void add(int a,int b, int c){
        int d = a+b+c;
        System.out.println(d);
    }

    public static void main(String[] args) {
        add(1,5);
        add(1,5,7);
    }
}

//we can achieve method overload with main method also but shoulld have diff type or lenght