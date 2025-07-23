public class pat6{
    public static void main(String[] args){
        int a = 0;
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                if(a==6)
                    a=0;
                System.out.print(a+1);
                System.out.print("   ");
                a++;
            }
        System.out.println();
        }
    }
}