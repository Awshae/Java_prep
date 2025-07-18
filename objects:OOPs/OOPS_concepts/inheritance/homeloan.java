public class homeloan extends loanAccount{
    int EMI;
    homeloan(int EMI){
        super(500);
        this.EMI = EMI;
    }
    public void homeloanDetails(){
        System.out.println("Monthly EMI : "+EMI);
    }
    public static void main(String[] args) {
        homeloan h = new homeloan(200);
        h.getDetails();
        h.loanAccountDetails();
        h.homeloanDetails(); 
    }
}