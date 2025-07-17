public class studen{
    String name;
    int mobno;
    char Section;

    studen(String name)
    {
        this.name = name;
            System.out.println("Name : "+name);
            System.out.println("------------");
    }
    studen(String name, int mobno)
    {
        this.name = name;
        this.mobno = mobno;

            System.out.println("Name : "+name);
            System.out.println("mobile no : "+mobno);
            System.out.println("------------");
    }
    studen(String name, int mobno, char section)
    {
        this.name = name;
        this.mobno = mobno;
        this.Section = section;
            System.out.println("Name : "+name);
            System.out.println("mobile no : "+mobno);
            System.out.println("section : "+section);
            System.out.println("------------");
    }

public static void main(String[] args) {
    studen s1 = new studen("Asher");
    studen s2 = new studen("Asher",98989);
    studen s3 = new studen("Asher",989775, 'A');
}
}