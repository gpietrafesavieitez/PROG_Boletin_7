package boletin_7_1;
import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class Boletin_7_1{
    private static Scanner leer = new Scanner(System.in);
    private static Libro libro1 = new Libro("Harry Potter","J.K. Rowling",0,0);

    private static int menu(){
        int select;
        System.out.println("\n  __  __                         _         _           _ \n" +
" |  \\/  |___ _ _ _  _   _ __ _ _(_)_ _  __(_)_ __ __ _| |\n" +
" | |\\/| / -_| ' | || | | '_ | '_| | ' \\/ _| | '_ / _` | |\n" +
" |_|  |_\\___|_||_\\_,_| | .__|_| |_|_||_\\__|_| .__\\__,_|_|\n" +
"                       |_|                  |_|          \n"
                + "\n[1] Ver datos do libro.\n"
                + "[2] Solicitar un prestamo.\n"
                + "[3] Facer unha devolucion.\n"
                + "[0] Salir.");
        try{ // Intenta convertir el input en int si no puede lanza excepcion y pone la var opcion a -1 
            select = Integer.parseInt(leer.nextLine());
        }catch(NumberFormatException e){
            select = -1;
        }
    return select;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        System.out.println("[*] Benvido ao sistema de xestion de libros. Porfavor, elixa unha opcion das que aparecen a continuacion:");
        int opcion;
        do{
            opcion = menu();
            switch(opcion){
                case 0: System.out.println("\n[*] Ata logo! :)"); break;
                case 1: System.out.println("\n[*] Datos do libro:\n" + libro1.toString()); break;
                case 2: 
                    if(libro1.prestar(1)){
                        System.out.println("\n[*] Operación realizada correctamente.");
                    }else{
                        System.out.println("\n[*] Operación fallida. Porfavor, inténtelo de nuevo.");
                    }
                    break;
                case 3: 
                    if(libro1.devolver(1)){
                        System.out.println("\n[*] Operación realizada correctamente.");
                    }else{
                        System.out.println("\n[*] Operación fallida. Porfavor, inténtelo de nuevo.");
                    }
                    break;
                default: System.out.println("\n[*] Formato incorrecto."); break;
            }
        }while(opcion != 0);
    }

}



