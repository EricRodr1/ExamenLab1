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
                    
                    System.out.println("Favor ingrese su texto a cifrar: ");
                    clave = sc.next();
                    for (int i = 0; i < clave.length(); i++) {
                        char caracter = clave.charAt(i);
                        if ( caracter >= 'a' && caracter <= 'z'){
                            char caracterinv = (char) ('z' - (caracter - 'a'));
                            clavecifrada = clavecifrada + caracterinv;
                        }
                        else if (caracter >= 'A' && caracter <= 'Z'){
                            char caracterinv = (char) ('Z' - (caracter - 'A'));
                            clavecifrada = clavecifrada + caracterinv;
                    } else {
                            clavecifrada = clavecifrada + caracter;
                        }
                        
                    }  System.out.println("Caracter cifrado: "+clavecifrada);
                    break;
                    //PIEDRA PAPEL O TIJERA
                case 3: 
                      
                   
                    boolean terminodejugar = false;

        while (terminodejugar == false) {
            String eleccionusuario = "";
            boolean valido = false;

             
            while (valido == false) {
                System.out.println("Bienvenido a piedra papel o tijera!");
                System.out.println("Favor elija: piedra, papel o tijera");
                eleccionusuario = sc.next().toLowerCase();

                if (eleccionusuario.equals("piedra") || eleccionusuario.equals("tijera") || eleccionusuario.equals("papel")) {
                    valido = true;
                } else {
                    System.out.println("Opción inválida, intente de nuevo");
                }
            }

             
            int aleatorio = random.nextInt(3);
            String computadora = "";

            if (aleatorio == 0) {
                computadora = "papel";
            } else if (aleatorio == 1) {
                computadora = "tijera";
            } else {
                computadora = "piedra";
            }

            System.out.println("Computadora: " + computadora);

             
            if (eleccionusuario.equals(computadora)) {
                System.out.println("Empate");
            } else if (eleccionusuario.equals("papel") && computadora.equals("piedra") ||
                       eleccionusuario.equals("tijera") && computadora.equals("papel") ||
                       eleccionusuario.equals("piedra") && computadora.equals("tijera")) {
                System.out.println("Usted gana");
            } else {
                System.out.println("La computadora gana");
            }

            System.out.println("Gracias por jugar!!");

             
            System.out.println("Desea jugar de nuevo? (si/no)");
            String respuesta = sc.next().toLowerCase();

            if (respuesta.equals("si")) {
                terminodejugar = false;
            } else {
                terminodejugar = true;
                System.out.println("Gracias por jugar");
            }  
        }
                    
                    
                     break;
                     //ADIVINAR
                case 4:
                    int  contador = 0;
                    int numingresado =0;
                    int numaleatorio = random.nextInt(100);
                    boolean adivinonum = false;
                    while (contador < 10 && adivinonum == false){
                        System.out.println("Favor ingrese un numero del 1 al 100: ");
                        
                        numingresado = sc.nextInt();
                        contador++;
                        if (numaleatorio == numingresado){
                            break;
                        }
                    }
                    if (numingresado == numaleatorio){
                        System.out.println("Felicidades adivino el numero en el intento #"+contador);
                        
                    } else if (numingresado != numaleatorio  ){
                        System.out.println("Lo siento, te quedaste sin intentos, el numero era "+numaleatorio);
                    }
                    
                    
                    break;
                case 5:
                    System.out.println("Saliendo del sistema");
                    break;
                default:
                    System.out.println("Opcion no valida, intente de nuevo");
                    break;
            }
        } while (opcion !=5);
    }
    
}
