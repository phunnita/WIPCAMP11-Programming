/*
 * WIP XI Computer Programing 
 */

package XI.Project;

import java.util.Scanner;

/**
 *
 * @author sittiwatlcp
 */
public class WIPCargo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int item = 0;
       int limit = 10;
       int menu;
//       int amount;
       
        System.out.print("item : ");
        item = sc.nextInt();
        System.out.print("limit : ");
        limit = sc.nextInt();
        System.out.print("1.Add\n2.Remove\n3.Check\n");
        System.out.print("menu : ");
        menu = sc.nextInt();
        
     
        
        
        if(menu == 1){
            if (item < limit){
                int amount;
                System.out.print("amount : ");
                amount = sc.nextInt();
                
                if (item + amount > limit){
                    System.out.println("ไอเท็มเกินลิมิต");
                }
                else{
                    System.out.printf("ไอเท็ม = %d\nlimit = %d",item+amount,limit);
                } 
                
            }
        }
        else if (menu == 2 ) {
            if (item == 0){
               System.out.print("ไอเท็มไม่พอ");
            }
            else {
                int amount2;
                System.out.print("amount : ");
                amount2 = sc.nextInt();
                if (amount2 > item){
                  System.out.println("ไอเท็มไม่พอ");  
                }else{
                 System.out.printf("ไอเท็ม = %d\nlimit = %d",item-amount2,limit);
                }
            }
        }
        else if(menu == 3){
        System.out.printf("ไอเท็ม = %d\nlimit = %d",item,limit);
        }
        }
    }
}
