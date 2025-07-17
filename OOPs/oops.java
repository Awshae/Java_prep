//OOPS= static/Non static/Constructor

public class oops
{
    static int b;
    int non_static; //all nonstatic members are stored in heap area.

    public void shakespeare()
    {
        System.out.println("Macbeth");
    }
public static void main(String[] args) {
        A.add2(5,6); //accesing class from A.java
        System.out.println(b); //printing static int b, default initialized to 0.
        System.out.println(oops.b);
        //syntax : ClassName name = new ClassName()
        oops object = new oops(); //creating object with new variable, gets created in the Heap Area. Returns address of current object.
        System.out.println(object); 
        oops object_non_static_method = new oops();
       object_non_static_method.shakespeare();

    }
}
