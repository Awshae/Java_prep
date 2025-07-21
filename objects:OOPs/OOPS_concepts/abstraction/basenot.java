public class basenot extends notbase{
    public void hello(){
        System.out.println("class Basenot");
    }
    public void bye(){
        System.out.println("Class Basenot_bye");
    }
    public static void main(String[] args) {
        base ob1 = new basenot();
        ob1.greet();
        //ob1.hello();
        //ob1.bye();
        System.out.println();
        notbase ob2 = new basenot();
        ob2.greet();
        ob2.hello();
        ob2.bye();
        System.out.println();
        basenot ob3 = new basenot();
        ob3.greet();
        ob3.hello();
        ob3.bye();
    }
}