package pruebacreararchivotexto;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.IllegalStateException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class LeerArchivoTexto{
	private Scanner entrada;

	//permite al susuario abrir el archivo
	public void abrirArchivo(){
		try{
			entrada = new Scanner( new File( "Clientes.txt" ) );
		}catch( FileNotFoundException fileNotFoundException){
			System.err.println( "Error al abrir el archivo." );
			System.exit( 1 ); 
		}//fin del catch
	}//fin del emtodo abrir archivo

	// lee registro del archivo
	public void leerRegistros(){
		//objeto que va a escribir en la pantalla
		RegistroCuenta registro = new RegistroCuenta();

		System.out.printf("%-9s%-15s%-18s%10s\n" , "Cuenta", 
			"Primer Nombre", "Apellido Paterno", "Saldo");
		try{//lee los objetos del archivo usando Scanner
			while(entrada.hasNext()){
				registro.establecerCuenta( entrada.nextInt());//lee el numero de cuenta
				registro.establecerPrimerNombre( entrada.next());//lee el primer nombre
				registro.establecerApellidoPaterno( entrada.next());// lee el apellido
				registro.establecerSaldo( entrada.nextDouble()); // lee el saldo

				//muestra el contenido registro
				System.out.printf( "<%-9d%-15s%-18s%10.2f\n", 
					registro.obtenerCuenta(), registro.obtenerPrimerNombre(),
					registro.obtenerApellidoPaterno(), registro.obtenerSaldo() );
			}//fin de while
		}catch( NoSuchElementException elementException ){
			System.err.println( "El archivo no esta bien formado. ");
			entrada.close();
			System.exit( 1 );
		}catch( IllegalStateException stateException){
			System.err.println( "Error al leer el archivo." );
			System.exit( 1 );
		}//fin del catch
	}//fin del metodo leer registros

	//cierra el archivo y termina la apliacion
	public void cerrarArchivo(){
		if( entrada != null ){
			entrada.close();//cierra el archivo
		}
	} // fin del metodo cerrar archivo
}// fin de la clase leerArchivo
