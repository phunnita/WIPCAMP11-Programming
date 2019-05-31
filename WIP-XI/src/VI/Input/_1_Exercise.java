/*
 * WIP XI Computer Programing 
 */

package VI.Input;

/**
 *
 * @author sittiwatlcp
 */

import java.util.Scanner;


public class _1_Exercise {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         
         int mom  ;
         int dad  ;
         
        System.out.print(" แม่ให้เงินมา ");

        mom = sc.nextInt();
        
        System.out.print(" พ่อให้เงินมา ");

        dad = sc.nextInt();
               
        System.out.println(" ได้เงินทั้งหมด " + (mom+dad));
    }
}
