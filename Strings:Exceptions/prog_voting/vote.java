import java.util.*;

public class vote{
    public static void main(String[] args) throws NotEligibleException{
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = s.nextInt();

        if(age>=18)
        {
            System.out.println("Eligibile for Voting");
        }
        else
            throw new NotEligibleException();
    }
}