public class string_program{

    public static void toarr(String s1){
        char[] arr = s1.toCharArray();
        for(int i=0;i<s1.length();i++)
        {
        System.out.println(arr[i]);
        }   
    }
    public static void main(String[] args) {
    System.out.println("String to Character");
    String s1 = "NMAMIT";
    System.out.println(s1);
    toarr(s1);
}
}
