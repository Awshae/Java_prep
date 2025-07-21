import java.util.*;

public class even_odd_sort{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = s.nextInt();
        int a[] = new int[size];
        System.out.println("Enter vals");
        for (int i = 0; i<size ; i++) 
        {
            a[i] = s.nextInt();
        }
        System.out.println("===================");

        int oddarr[] = new int[a.length/2];
        int evearr[] = new int[a.length/2];
        for (int i = 1; i<a.length; i+=2){
            oddarr[i/2] = a[i]; }
        Arrays.sort(oddarr);
        System.out.println("Sorted odd position is: ");
        for(int i = 0; i<oddarr.length; i++){
            System.out.print(oddarr[i]+ " ");
        }

        for (int i = 0; i<a.length; i+=2){
            evearr[i/2] = a[i];
        }
        Arrays.sort(evearr);
        System.out.println("\nSorted even position is: ");
        for(int i = 0; i<evearr.length; i++){
            System.out.print(evearr[i]+ " ");
        }

        System.out.println("\nThe sum of second last largest even postion and second odd postion is: ");
        System.out.print(evearr[evearr.length-2]+oddarr[1]);
    }
}