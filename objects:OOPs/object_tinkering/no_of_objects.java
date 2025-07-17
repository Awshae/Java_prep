public class no_of_objects{

    //program to count number of objects in a class.
    static int a=0;
    no_of_objects(){
        a = a+1;
    }

public static void main(String[] args) {
    no_of_objects Object1 = new no_of_objects();
    no_of_objects Object2 = new no_of_objects();
    no_of_objects Object3 = new no_of_objects();
    no_of_objects Object4 = new no_of_objects();
    no_of_objects Object5 = new no_of_objects();
    no_of_objects Object6 = new no_of_objects();
    no_of_objects Object7 = new no_of_objects();

    System.out.println(a);
}
}