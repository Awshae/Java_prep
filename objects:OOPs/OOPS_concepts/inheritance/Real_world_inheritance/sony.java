public class sony extends consoles{
    int ps;
    
    
    public void getyear(int ps){
        switch(ps)
        {
            case(1): {System.out.println("PS1 came out in 2000"); break;}

            case(2): {System.out.println("PS2 came out in 2001"); break;}

            case(3): {System.out.println("PS3 came out in 1996"); break;}

            case(4): {System.out.println("PS4 came out in 1996"); break;}

            case(5): {System.out.println("PS5 came out in 1996"); break;}

        }
    }

    public static void main(String[] args) {
        System.out.println("Enter 1 for PS1\n...\nEnter 5 for PS5");


    }
}