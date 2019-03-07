package pruebacreararchivotexto;
import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.io.File;

public class CrearArchivoTexto{
    private Formatter salida;
    //permite al usuario abriri el archivo
    public void abrirArchivo(){
		try{
			salida = new Formatter( "clientes.txt" );
		}//fin de try
		catch ( SecurityException securityException ){
			System.err.println(
				"No tiene acceso de escritura a este archivo." );
			System.exit( 1 );
		}//fin del catch
		catch ( FileNotFoundException filsNotFoundException ){
			System.err.println( "Error al crear el archivo." );
		}//fin del catch
	}//fin del emtodo abrir Archivo

	//agrega registros al archivo
	public void agregarRegistros(){
		//objeto se va a escribir en el archivo
		RegistroCuenta registro = new RegistroCuenta();

		Scanner entrada = new Scanner ( System.in );               
			System.out.printf( "%s\n%s" ,
				"Escriba el numero de cuenta (> 0), primer nombre, apellido paterno y saldo. " ,
				" ? " );
                        int cantidad;
			do{//itera hasta encontara el indicador de fin de archivo
				try{//encia valores al archivo
					//obtiene los datos que se va a enviar
					registro.establecerCuenta( entrada.nextInt() );//lee el numero de cuenta
					registro.establecerPrimerNombre( entrada.next() ); // lee el primer nombre
					registro.establecerApellidoPaterno( entrada.next() ); // lee el apellido paterno
					registro.establecerSaldo( entrada.nextDouble() ); // lee el saldo 

					if ( registro.obtenerCuenta() > 0 ) {
						//escribe el nuevo registro
						salida.format( "%d %s %s %.2f\n", registro.obtenerCuenta(),
							registro.obtenerPrimerNombre(), registro.obtenerApellidoPaterno(),
							registro.obtenerSaldo() );
					}else{
						System.out.println(
							"El numero de cuenta debe ser mayor que 0." );
					}//fin de else	
				}catch ( FormatterClosedException formatterClosedException ){
					System.err.println( " Error al escribir en el archivo." );
				}catch ( NoSuchElementException elementException ){
					System.err.println ( "Entrada invalida. intente d enuevo." );
					entrada.nextLine(); //decarta la entrada para que el usuario intente de nuevo
				}// fin del catch

				//System.out.printf( "%s %s\n%s", "Escriba el numero de cuenta (>0).",
				//	"primer nombre, apellido paterno y saldo", " ?");
                                System.out.println("Desea agregar otro registro?    0)no   1)si" );
                                cantidad = entrada.nextInt();
			}while(cantidad != 0);//fin del while	
	}//fin del metodo agregarRegistros

	//cierra el file
	public void cerrarArchivo(){
		if ( salida != null) {
			salida.close();
		}
	}//fin del metodo cerrarArchivo
}//fin de la clase CrearArchivoTexto