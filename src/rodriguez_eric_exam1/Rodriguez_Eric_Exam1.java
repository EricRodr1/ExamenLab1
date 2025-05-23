/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rodriguez_eric_exam1;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Eric Rodriguez
 */
public class Rodriguez_Eric_Exam1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int filas = 0; 
        Scanner sc = new Scanner (System.in);
        sc.useDelimiter("\n");
        int opcion =0;
        // TODO code application logic here
        do {
            System.out.println("*** MENU ***");
            System.out.println("1. PIRAMIDE");
            System.out.println("2. CLAVE");
            System.out.println("3. PIEDRA, PAPEL O TIJERA");
            System.out.println("4. ADIVINAR");
            System.out.println("5. SALIR");
            opcion = sc.nextInt();
            switch (opcion){
                //Piramide
                 
                case 1:
                   
                    System.out.println("Ingrese cuantas filas va a imprimir: ");
                    filas = sc.nextInt();
        
        int numactual = 1; 
       
        for (int fila = 1; fila <= filas; fila++) {
            int sumadefilas = 0; 
            String tfila = "";  

            
            for (int i = 0; i < fila; i++) {
                tfila = tfila + numactual; 
                sumadefilas = sumadefilas + numactual;   

                
                if (i < fila - 1) {
                    tfila = tfila + " ";
                }
                numactual = numactual + 2;
            }

           
            System.out.println(tfila + " = " + sumadefilas);
        }

            break;
                case 2:
                    String clave = "";
                    System.out.println("Favor ingrese su texto cifrado");
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    break;
                case 3: 
                    System.out.println("Bienvenido a piedra papel o tijera!");
                    System.out.println("Favor ingrese: piedra, papel o tijera ");
                    String eleccionusuario="";
                    eleccionusuario = sc.next();
                    
                    
                    break;
                    
            }
        } while (opcion !=5);
    }
    
}
