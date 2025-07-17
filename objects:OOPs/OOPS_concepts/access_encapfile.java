public class access_encapfile{
    public static void main(String[] args) {
        student s = new student();
        System.out.println(s.getName());
        System.out.println(s.getmobno());
        System.out.println();

        s.setname("Hera");
        s.setmobno(829);
        System.out.println(s.getName());
        System.out.println(s.getmobno());
    } 
}