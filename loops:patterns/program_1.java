//Question: The given problem is a number. The digits must be added to ensure a single digit answer; E.g. 12345-->1+2..+5=15---->1+5->6, 6 is the answer.


public class program_1{
    public static void main(String[] args) {
        int num = 12345;
        int sum = 0;
        while(num>0)
        {
            int rem = num%10;
            sum = rem+sum;
            num=num/10;
        }
        System.out.println(sum);
        if(sum>9)
        {// Second loop if digits added answer > 9 
        int fsum=0;
            while(sum>0)
            {
            int rem = sum%10;
            fsum = rem+fsum;
            sum=sum/10;
            }
        System.out.println(fsum);
        }
        else
            System.out.println(sum);
    }
}
