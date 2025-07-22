import java.util.*;
public class tryexceptfinally{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first val");
        try
        {
            int a = s.nextInt();
            System.out.println("Enter second val");
            int b = s.nextInt();
            double Result = a/b;
            System.out.println(Result);
        }catch(InputMismatchException e)
        {
            System.out.println("Please stick to numbers");
        }catch(ArithmeticException e)
        {
            System.out.println("Enter valid Denominator");
        }catch(Exception e)
        {
            System.out.println("Please check the inputs");
        }
        finally
        {
            System.out.println("Thank you for using");
        }
    }
}