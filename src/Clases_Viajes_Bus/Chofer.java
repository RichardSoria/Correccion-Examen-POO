package Clases_Viajes_Bus;

public class Chofer {
    private String nombre;
    private String licencia;
    private int experiencia;
    private String telefono;

    public Chofer(String nombre, String licencia, int experiencia, String telefono) {
        this.nombre = nombre;
        this.licencia = licencia;
        this.experiencia = experiencia;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Licencia: " + licencia);
        System.out.println("Experiencia: " + experiencia + " años");
        System.out.println("Teléfono: " + telefono);
    }
}
