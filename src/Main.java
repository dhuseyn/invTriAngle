import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a, i, j;
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayi gir : ");
        a = inp.nextInt();

        for (i=a; i>=0; i--){
            for (j=a-i; j>=0; j--) System.out.print(" ");
            for (j=1; j<=(2*i-1); j++) System.out.print("*");
            System.out.println();
        }
    }
}