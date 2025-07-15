public class evennumbers{
    public static void main(String[] args) {
        int a,b;
        int count = 0;
        int sum = 0;
        a=1;
        b=10;
        while(a<=b){
            if(a%2==0)
                {System.out.println(a);
                count=count+1;
                sum=sum+a;
                }
            a++;
        }
        System.out.println("the total count of even numbers is "+count);
        System.out.println("the total sum of even numbers is "+sum);
    }
}