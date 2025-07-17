public class Marks{
    public static void main(String[] args) {
        int sub1, sub2, sub3;
        sub1 = 2;
        sub2 = 69;
        sub3 = 70;

        if(sub1>=40 && sub2>=40 && sub3>=40){
            double per = (sub1+sub2+sub3)/3;
            if (per>=85)
                System.out.println("Dist");
            else if(per>75)
                System.out.println("FC");
            else
                System.out.println("Pass");
            
        }
        else
            System.out.println("Fail");
    }
}