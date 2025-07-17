//using scanner class
/*
nextBoolean()	Reads a boolean value from the user
nextByte()	Reads a byte value from the user
nextDouble()	Reads a double value from the user
nextFloat()	Reads a float value from the user
nextInt()	Reads a int value from the user
nextLine()	Reads a String value from the user
nextLong()	Reads a long value from the user
nextShort()	Reads a short value from the user
next().charAt(0)  Reads a character from the user
*/

import java.util.Scanner;

class scanner_class{
public static void main(String[] args) {
    int a,b;
    System.out.println("Enter the numbers of a and b");
    Scanner sc = new Scanner(System.in);
    a = sc.nextInt();
    b = sc.nextInt();
    
    int c = a+b;
    System.out.println(c+" is the sum");
}   
}