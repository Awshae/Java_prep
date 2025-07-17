//Question: The given problem is a number. The digits must be divided to the original number to obtain the answer; E.g. 12345-->1+2..+5=15---->12345/15= 823; which is the answer.


public class prog2{
    public static void main(String[] args) {
        int num = 12345;
        int temp = num;
        int sum = 0;
        while(num>0)
        {
            int rem = num%10;
            sum = rem+sum;
            num=num/10;
        }
        //System.err.println(sum);
        int finala;
        finala = temp/sum;
        System.out.println(finala);
    }  
}
