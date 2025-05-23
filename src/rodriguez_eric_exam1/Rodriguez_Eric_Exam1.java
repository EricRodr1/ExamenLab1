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
           
           String clavecifrada="";
        Scanner sc = new Scanner (System.in);
        Random random = new Random ();
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
                    clave = sc.next();
                           
                    /*for (int i = 0; i < clave.length(); i++) {
                        char caracter = clave.charAt(i);
                        if ( caracter >= 'a' && caracter <= 'z'){
                            caracter = (char) ('a' + 'z' - caracter);
                        } 
                        clavecifrada = clave + caracter;
                    }
                    System.out.println("Mensaje cifrado: "+clavecifrada);*/
            
        }
       
        System.out.println("Oracion cifrada: " + clavecifrada);

     

                    break;
                case 3: 
                  String eleccionusuario="";
                    boolean valido = false;
                    while (valido == false){
                    System.out.println("Bienvenido a piedra papel o tijera!");
                        System.out.println("Favor eliga: piedra papel o tijera");
                        eleccionusuario = sc.next().toLowerCase();
                        if (eleccionusuario.equals("piedra") || eleccionusuario.equals("tijera") || eleccionusuario.equals("papel")){
                        valido = true;
                    } else {
                        System.out.println("Opcion invalida, intente de nuevo");
                        valido = false;
                    }
                    }
                    
                    int aleatorio = random.nextInt(3);
                    String computadora = ""; //La eleccion de la computadora 
                    if (aleatorio == 1){
                        computadora = "papel";
                    } else if (aleatorio == 2){
                        computadora = "tijera";
                    } else if (aleatorio == 3){
                            computadora = "piedra";
                            }
                    System.out.println("Computadora: "+computadora);
                   
                    if (eleccionusuario.equals(computadora)){
                        System.out.println("Empate ");
                    } else if (eleccionusuario.equals("papel") && computadora.equals("piedra"))  {
                        System.out.println("Usted gana");
                    } else if (eleccionusuario.equals("tijera") && computadora.equals("papel")){
                            System.out.println("Usted gana");
                            } else if (eleccionusuario.equals("piedra") && computadora.equals("tijera")){
                                System.out.println("Usted gana");
                            } else {
                                System.out.println("La computadora gana");
                            }
                     break;
                case 4:
                    
                default:
                    System.out.println("Opcion no valida, intente de nuevo");
                    break;
            }
        } while (opcion !=5);
    }
    
}
