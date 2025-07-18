class base
{
    String name;
    int accNo;
    double bal;

base(String name, int accNo, double bal)
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
    base p1 = new base("Rumi",203,689);
    p1.getDetails();
    p1.withdrawal(700);
    System.out.println();
    base p2 = new base("Zoey",302,986);
    p2.getDetails();
    p2.withdrawal(300);
    System.out.println();
    base p3 = new base("Mira",403,90000);
    p3.getDetails();
    p3.Deposit(560000);
    System.out.println();
}
}