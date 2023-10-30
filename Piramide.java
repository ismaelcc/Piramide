
package piramide;

import java.util.Scanner;
public class Piramide {

    
    public static void main(String[] args) {
    
    Scanner numfilas= new Scanner (System.in);
        System.out.println("Ingrese el Numero de filas que desea");
       int filas=numfilas.nextInt();
    
  
       
        for (int i = 0; i <= filas; i++) {
            System.out.print("");
            for (int j = 0; j <= filas-i; j++) {
            }
            for (int k = 0; k < 1*i; k++) {
                System.out.print("*");
            }
            System.out.println();
            }
            
        }
    }
    
