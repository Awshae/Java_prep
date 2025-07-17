public class nested{
    public static void main(String[] args) {
        int a,b,c,d;
        a=10;
        b=23;
        c=10;
        d=36;
        if(a>b){
            if(a>c)
                if(a>d)
                    System.out.println(a+" is the largest");
                else
                    System.out.println(d+" is the largest");
            else if(b>c)
                    if(b>d)
                        System.out.println(b+" is the largest");
            else if(c>d)
                System.out.println(c+" is the largest");
                }
        else
            System.out.println(d+" is the largest");
    }
}