public class savingAccount extends Account{
    //single leavel inheritance
    int saving;

    savingAccount(int saving) {
        super("victorville",894,2222);
        this.saving = saving;
    }
    
    public void savingAccountDetails(){
        System.out.println("Monthly Saving : " +saving);
    }

    public static void main(String[] args) {

        //upcasting
        Account a = new savingAccount(500);
        a.getDetails();
        //downcasting
        savingAccount s = (savingAccount)a;
        s.getDetails();
        s.savingAccountDetails();

        /*savingAccount s = new savingAccount(500);
        s.getDetails();
        s.savingAccountDetails();*/
    }
}