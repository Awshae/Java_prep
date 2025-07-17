class student
{   //data hiding is the process of restricing the state by providing access control to the behaviour.
    // private, getter()- for reading the data, and setter()-> modifying the data, can be used for data hiding
    private String name = "Hero";
    private int mobno = 234;
    public String getName()
    {
        return name;
    }
    public int getmobno()
    {
        return mobno;
    }
    public void setname(String name)
    {
        this.name = name;
    }
    public void setmobno(int mobno)
    {
        this.mobno=mobno;
    }
public static void main(String[] args) {
}
}