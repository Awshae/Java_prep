import java.util.Scanner;
import java.util.TreeMap;

public class Tree_lib{
    public static void main(String[] args) 
    {
    
    TreeMap<Integer,String> h = new TreeMap();
    h.put(1,"JAVA");
    h.put(2,"PERL");
    h.put(3,"CSS");
    h.put(4,"JS");

    Scanner s= new Scanner(System.in);
    System.out.println("Enter the subject ID");
    int s_id = s.nextInt();

    if(h.containsKey(s_id))
        System.out.println("The book "+h.get(s_id)+" is found.");
    else    
        System.out.println("Book not found");
    }
}