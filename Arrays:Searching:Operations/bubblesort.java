import java.util.Scanner;
//import java.util.*  imports all the objects from java
public class bubblesort
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Size");
        int size = s.nextInt();
        int a[] = new int[size];
        System.out.println("Enter vals");
        for (int i = 0; i< size ; i++) {
            a[i] = s.nextInt();   
        }
        int flag = 0;
        for(int i=0; i<a.length;i++){
            for(int j=i+1; j<a.length;j++){
                if(a[i]>a[j]){ //change > to < for descending order
                    int b= a[i];
                    a[i]= a[j];
                    a[j]= b;
                    flag++;
                }
            }
        }
        // Arrays.sort(a);

        System.out.println("Ascending order");
        for(int i=0; i<a.length;i++){
        System.out.println(a[i]);
        }
        System.out.println("Descending order");
        for(int i=a.length-1; i>=0;i--){
        System.out.println(a[i]);
        }
        System.out.println("No of positions changed");
        System.out.println(flag);
    }
}
