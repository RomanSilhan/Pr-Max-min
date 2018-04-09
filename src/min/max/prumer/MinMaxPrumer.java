/*

 * To change this license header, choose License Headers in Project Properties.

 * To change this template file, choose Tools | Templates

 * and open the template in the editor.

 */
package min.max.prumer;

import java.util.Scanner;

/**
 *
 *
 *
 * @author roman.silhan
 *
 */
public class MinMaxPrumer {

    /**
     *
     * @param args the command line arguments
     *
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in, "CP1250");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int soucet = 0, pocet = 0;
        while (true) {
            pocet++;
            System.out.println("Vlož Čislo");
            int v = sc.nextInt();
            if (v < min) {
                min = v;
            }
            if (v > max) {
                max = v;
            }
            if (v == 0) {
                break;
            }
            soucet = soucet + v;
            if (v < min) {
                min = v;
            }
            if (v > max) {
                max = v;
            }
            System.out.println("minimum " + min);
            System.out.println("maximum " + max);
            System.out.println("prumer " + ((float) soucet / pocet));
            System.out.println("Obvod r=vlozen "+((float)Math.PI*v));
            System.out.println("Obsah r=vlozen "+((float)Math.PI*(v*v)));
        }
    }
}
