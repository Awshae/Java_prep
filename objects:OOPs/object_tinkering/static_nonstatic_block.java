public class static_nonstatic_block{
    {
        System.out.println("Non-Static Block-1");
    }
public static void main(String[] args) {
    System.out.println("Main Method Begin");
    static_nonstatic_block ob1 = new static_nonstatic_block();
    static_nonstatic_block ob2 = new static_nonstatic_block();
    System.out.println("Main Method End");

}
{
    System.out.println("Non-Static Block-2");
}

}