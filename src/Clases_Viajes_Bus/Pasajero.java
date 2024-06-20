package Clases_Viajes_Bus;
import java.util.Scanner;

public class Pasajero
{
    Scanner entrada = new Scanner(System.in);
    String nombre_pasajero;
    String dni_pasajero;
    int edad_pasajero;
    String sexo_pasajero;
    String nacionalidad_pasajero;

    public Pasajero() {}

    public Pasajero(String nombre_pasajero, String dni_pasajero, int edad_pasajero, String sexo_pasajero, String nacionalidad_pasajero)
    {
        this.nombre_pasajero = nombre_pasajero;
        this.dni_pasajero = dni_pasajero;
        this.edad_pasajero = edad_pasajero;
        this.sexo_pasajero = sexo_pasajero;
        this.nacionalidad_pasajero = nacionalidad_pasajero;
    }

    public String getNombre_pasajero() {
        return nombre_pasajero;
    }

    public void setNombre_pasajero(String nombre_pasajero) {
        this.nombre_pasajero = nombre_pasajero;
    }

    public String getDni_pasajero() {
        return dni_pasajero;
    }

    public void setDni_pasajero(String dni_pasajero) {
        this.dni_pasajero = dni_pasajero;
    }

    public int getEdad_pasajero() {
        return edad_pasajero;
    }

    public void setEdad_pasajero(int edad_pasajero) {
        this.edad_pasajero = edad_pasajero;
    }

    public String getSexo_pasajero() {
        return sexo_pasajero;
    }

    public void setSexo_pasajero(String sexo_pasajero) {
        this.sexo_pasajero = sexo_pasajero;
    }

    public String getNacionalidad_pasajero() {
        return nacionalidad_pasajero;
    }

    public void setNacionalidad_pasajero(String nacionalidad_pasajero) {
        this.nacionalidad_pasajero = nacionalidad_pasajero;
    }

    public void ingresar_datos_pasajero()
    {
        System.out.println("Ingrese el nombre pasajero");
        entrada.nextLine();
        setNombre_pasajero(entrada.nextLine());
        System.out.println("Ingrese el dni pasajero");
        setDni_pasajero(entrada.nextLine());
        System.out.println("Ingrese el edad pasajero");
        setEdad_pasajero(entrada.nextInt());
        System.out.println("Ingrese el sexo pasajero");
        setSexo_pasajero(entrada.nextLine());
        System.out.println("Ingrese el nacionalidad pasajero");
        setNacionalidad_pasajero(entrada.nextLine());

    }
    public void mostar_datos_pasajero()
    {
        System.out.println(getNombre_pasajero());
        System.out.println(getDni_pasajero());
        System.out.println(getEdad_pasajero());
        System.out.println(getSexo_pasajero());
        System.out.println(getNacionalidad_pasajero());
    }
}



