public class pat5{
    public static void main(String[] args) 
    {
    for(int i=0;i<4;i++)
    {
        for(int j=0;j<4;j++)
        {
            if(i<=j){
                System.out.print(j+1);
                }
            else
                System.out.print("  ");
        }
        System.out.println();
    }  
}
}