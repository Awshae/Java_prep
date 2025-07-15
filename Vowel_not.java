public class Vowel_not{
    public static void main(String[] args) {
        char a = 'g';
        switch(a)
        {
            case('a'): 
            case('e'): 
            case('i'): 
            case('o'): 
            case('u'): 
            case('A'): 
            case('E'): 
            case('I'): 
            case('O'): 
            case('U'): {System.out.println("Vowel"); break;}
            default: {System.out.println("Consonant");}
        }
    }
}