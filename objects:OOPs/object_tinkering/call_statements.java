public class call_statements{

    call_statements() 
    {
        this('a');
        System.out.println(1);
    }
    call_statements(char c) 
    {
        this(10);
        System.out.println(2);
    }
    call_statements(int a) 
    {
        System.out.println(3);
    }
    public static void main(String[] args) 
    {
        call_statements object = new call_statements();
        System.out.println("--------------------------");
        call_statements object2 = new call_statements(10);
        System.out.println("--------------------------");
        call_statements object3 = new call_statements('a');
       
    }
    
}