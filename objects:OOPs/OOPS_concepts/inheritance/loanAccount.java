public class loanAccount extends Account{
    int loanAmount;

loanAccount(int loanAmount) {
        super("ash",3000,2900);
        this.loanAmount = loanAmount;
    }
    
    public void loanAccountDetails(){
        System.out.println("loan amount : " +loanAmount);
    }

    public static void main(String[] args) {
        loanAccount s = new loanAccount(4555500);
        s.getDetails();
        s.loanAccountDetails();
    }
}

