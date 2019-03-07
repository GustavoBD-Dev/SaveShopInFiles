package pruebacreararchivotexto;
public class RegistroCuenta {
    private int cuenta;
    private String primerNombre;
    private String apellidoPaterno;
    private double saldo;
    //el contructor sin argumentos llama a otro cinstuctor con valores determinados
    public RegistroCuenta(){
        this(0, "", "", 0.0);//llama al constructor con cuatro argumentos
    }//fin del constructor
    //inicializa un registro
    
    public RegistroCuenta(int cta, String nombre, String apellido, double sal){
        establecerCuenta( cta );
        establecerPrimerNombre( nombre );
        establecerApellidoPaterno( apellido );
        establecerSaldo ( sal );
    }//fin del constructor de RegistroCuenta con cuatro argumentos
    
    //establece el numero de cuenta
    public void establecerCuenta( int cta ){
        cuenta = cta;
    }//fin del metodo establecerCuenta
        
    //obtiene el numero de cuenta
    public int obtenerCuenta(){
        return cuenta;
    } //fin del metodo obtenerCuenta 
    
    //establece el primer nombre
    public void establecerPrimerNombre( String nombre ){
        primerNombre = nombre;
    } // fin del metodo establecer nombre
    
    // obtiene el primer nombre
    public String obtenerPrimerNombre(){
        return primerNombre;
    } // fin del metodo primer nombre
    
    //establece el apellido paterno
    public void establecerApellidoPaterno( String apellido ){
        apellidoPaterno = apellido;
    }// fin del modo establecerApellidoPaterno
    
    //obtiene el apelldio paterno
    public String obtenerApellidoPaterno(){
        return apellidoPaterno;
    }// fin del metodo obtener apelldio paterno
    
    //establece el saldo
    public void establecerSaldo( double sal){
        saldo = sal;
    }//fin del metodo establecerSaldo
    
    //obtine ele saldo
    public double obtenerSaldo(){
        return saldo;
    }//fin dle metodo obtener saldo
      
    /*
    public static void main(String[] args) {
        // TODO code application logic here
    }
    */
}//din de la clase RegistroCuenta
