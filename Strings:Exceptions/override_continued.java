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

public String toString()
{
    System.out.println("Name: "+name);
    System.out.println("Acc No: "+accNo);
    System.out.println("Balance : "+bal);
    return "Thank you";
}
public boolean equals(Object o)
{
    base a = (base)o;
    return (a.name == this.name) && (a.accNo == this.accNo) && (a.bal == this.bal);

}
public void Deposit(int amount)
{
    bal+=amount;
    System.out.println("Deposit of "+amount+" is sucessful");
    System.out.println("Balance "+bal);
}

public static void main(String[] args) {
    System.out.println("==================");
    base ac = new base("Jarvis",5544,55.4);
    base ab = new base("Jarvis",5544,55.4);
    System.out.println(ac==ab); //compares address
    System.out.println(ac.equals(ab)); //compares value
    System.out.println(ac.toString());
}
}