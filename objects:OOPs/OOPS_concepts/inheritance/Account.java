class Account
{
    String name;
    int accNo;
    double bal;

Account(String name, int accNo, double bal)
{
    this.name=name;
    this.accNo=accNo;
    this.bal=bal;
}

public void getDetails(){
    System.out.println("Name: "+name);
    System.out.println("Acc No: "+accNo);
    System.out.println("Balance : "+bal);
}

public void withdrawal(int amount)
{
    if(amount<=bal)
    {
        bal-=amount;
        System.out.println("withdrawal of "+amount+" is sucessful");
        System.out.println("Balance "+bal);
    }else
    {
        System.out.println("withdrawal of "+amount+" is unsucessful due to Insufficient Funds");
        System.out.println("Balance "+bal);
    }
}

public void Deposit(int amount)
{
    bal+=amount;
    System.out.println("Deposit of "+amount+" is sucessful");
    System.out.println("Balance "+bal);
}

public static void main(String[] args) {
    Account p1 = new Account("Rumi",203,689);
    p1.getDetails();
    p1.withdrawal(700);
    System.out.println();
    Account p2 = new Account("Zoey",302,986);
    p2.getDetails();
    p2.withdrawal(300);
    System.out.println();
    Account p3 = new Account("Mira",403,90000);
    p3.getDetails();
    p3.Deposit(560000);
    System.out.println();
}
}