import java.io.*;
import java.util.*;

public class Datatypes {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int t = scan.nextInt();

        for(int i=0;i<t;i++){
            try {
                Long n = scan.nextLong();
                System.out.println(n + " can be fitted in:");

                if (n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
                }
                if (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }
                if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }
                System.out.println("* long");
            }
            catch (Exception e) {
                System.out.println(scan.next() + " can't be fitted anywhere.");
            }
        }
    }}
