/**
 * Exercício 048
 * @author Alberto Vargas Carneiro
 * @version 16/06/2022
 */

import java.util.Scanner;

public class Exercicio048 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] a = new int[5];
        int[] b = new int[5];

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < b.length; i++) {
            b[i] = sc.nextInt();
        }

        int[] c = new int[5];
        int j =4;
        
        for (int i = 0; i < 5; i++) {
            c[i] = b[j] - a[i];
            j--;
        }
        for (int i = 0; i < c.length; i++) {
            if (i>0) {
                System.out.print(" ");
            }
            System.out.print(c[i]);
        }
        sc.close();
    }
}
