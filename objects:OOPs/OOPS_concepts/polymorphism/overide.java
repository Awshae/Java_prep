public class overide{
    String name = "Hero";
    int mobno = 498;

    public String toString()
    {
        System.out.println(name);
        System.out.println(mobno);
        return "Thank you";
    }

    public static void main(String[] args) {
        overide ob = new overide();
        System.out.println(ob);
        System.out.println(ob.toString());
    }  
}