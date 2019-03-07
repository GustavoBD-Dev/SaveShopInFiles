package pruebacreararchivotexto;
import java.util.Scanner;
public class PruebaCrearArchivoTexto {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        int opcion;
        CrearArchivoTexto aplicacion = new CrearArchivoTexto();
        LeerArchivoTexto lectura = new LeerArchivoTexto();       
        System.out.println("Desea insertar o leer  (1)insertar   (2)leer");
        System.out.println("? ");
        opcion = enter.nextInt();
        switch(opcion){
            case 1:
                aplicacion.abrirArchivo();
                aplicacion.agregarRegistros();
                aplicacion.cerrarArchivo();
                break;
            case 2:
                lectura.abrirArchivo();
                lectura.leerRegistros();
                lectura.cerrarArchivo();
                break;
            default:
                break;
        }//fin del switch            
    }//fin de main
} // fin de la clase PruebaCrearArchivo
