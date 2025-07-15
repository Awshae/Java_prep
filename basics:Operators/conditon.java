class conditon{
    public static void main(String[] args) {
        int a,b,c,d;
        a = 30;
        b = 40;
        c = 10;
        d = 25;
        int r1 = a>b && a>c && a>d ?a:
                 b>a && b>c && b>d ?b:
                 c>a && c>b && c>d ?c: d;
        
        System.out.println("The largest number is "+r1);
    }
}