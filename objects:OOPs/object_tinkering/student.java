public class student{
    //static String name;
    //static int mobno;
    String name;
    int mobno;

public void studentDetails(){
    System.out.println(name);
    System.out.println(mobno);
}

public static void main(String[] args) {
        /* plain vanilla static stuff
        name = "asher";
        mobno = 702281300;

        System.out.println("Name : " +name);
        System.out.println("Number : " +mobno);
        System.out.println("----------------");

        name = "jack";
        mobno = 702288388;

        System.out.println("Name : " +name);
        System.out.println("Number : " +mobno);
        System.out.println("----------------");
        */
       /* non-static calling in static using objects
       String name;
       int mobno;
       student s1 = new student();
       s1.name = "asher";
       s1.mobno = 702281300;
       System.out.println(s1.name);
       System.out.println(s1.mobno);
       student s2 = new student();
       s2.name = "rehsa";
       s2.mobno = 100318220;
       System.out.println(s2.name);
       System.out.println(s2.mobno);
       */

       student s1 = new student();
       s1.name = "asher";
       s1.mobno = 702281300;
       s1.studentDetails();
       
       student s2 = new student();
       s2.name = "rehsa";
       s2.mobno = 100318220;
       s2.studentDetails();
    }
}