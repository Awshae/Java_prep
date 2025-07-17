
public class Constuct{
    // two types- NAC:no args cons and PC:parametric cons
    // only one NA constructor because same class name, multiple PC can be made
    String name;
    int mobno;
    static char section = 'R';
    Constuct(){
        System.out.println("PC");
    }

public Constuct(String name, int mobno) {
            this.name = name;
            this.mobno = mobno;
        }
public void Deetz(){
    System.out.println("NAME : "+name);
    System.out.println("MOBILE NUMEBER : "+mobno);
    System.out.println("SECTION : "+section);
}  
    

public static void main(String[] args) {
    Constuct s1 = new Constuct("ASHER",123);
    s1.Deetz();
    Constuct s2 = new Constuct("JARVIS",456);
    s2.Deetz();
}
}