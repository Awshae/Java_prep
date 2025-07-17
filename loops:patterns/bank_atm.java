public class bank_atm{
    public static void main(String[] args) {
        double balance = 10000;
        int password = 1234;
        int userpassword = 1234;

        System.out.println("Press 1 for withdrawal\n2 for deposit");
        int option = 2;
        switch(option)
        {
            case(1) : {
                if(userpassword == password)
            {
            double currentbalance,withdraw;
            System.out.println("Enter Amount");
            withdraw = 5000;
            System.out.println("Withdrawal of "+withdraw);
            if(withdraw<=balance){
                currentbalance = balance - withdraw;
                System.out.println("Transaction Successful");
                balance = currentbalance;
                System.out.println("Balance is "+balance);
            }else
            {   System.out.println("Insufficient Funds");
                System.out.println("Current balance "+balance);
            }
            }  
            else
                System.out.println("Incorrect Pin");
            break;}

            case(2) : {
                if(userpassword == password){
                    double deposit;
                    deposit = 1000;
                    System.out.println("Deposit of "+deposit);
                    balance = balance + deposit;
                    System.out.println("Transaction Successful");
                    System.out.println("Balance is "+balance);
                }
            }
            default: System.out.println("Please select 1 or 2");
        }
    System.out.println("Thank you for using");
    }
}