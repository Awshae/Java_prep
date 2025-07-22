public class adv_ops{
    public static void main(String[] args){
        System.out.println("Character to String");
        char ch[] = { 'N' , 'M' , 'A' , 'M' , 'I' , 'T'};

        System.out.println("Under constructor");
        String s1 = new String(ch);
        System.out.println(s1);
        System.out.println("-----------------");

        System.out.println("Using method");
        String s2 = String.valueOf(ch);
        System.out.println(s2);
        System.out.println("-----------------");

        String s3 = "";
        for( int i = 0; i<ch.length; i++){
            s3+=ch[i];
        }
        System.out.println(s3);
        System.out.println("-----------------");

        char ch1[] = s3.toCharArray();
        for( int i = 0; i<ch.length; i++){
            System.out.println(ch1[i]);
        }
    }
}