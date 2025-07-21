abstract public class notbase extends base{
    public void greet()
    {
        System.out.println("Class Notbase");
    }
    abstract  public void hello();

    void bye() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}