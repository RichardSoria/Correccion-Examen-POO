package Clases_Viajes_Bus;

public class Ruta extends Ticket
{
    String ciudad_origen;
    String ciudad_destino;
    Double distancia_ruta;
    String duracion_ruta;

    public Ruta() {}

    public Ruta(String nombre_pasajero, String dni_pasajero, int edad_pasajero, String sexo_pasajero, String nacionalidad_pasajero, String id_ticket, Double precio_ticket, String fecha_compra, String fecha_salida, int numero_asiento, Boolean estado_ticekt, String ciudad_origen, String ciudad_destino, Double distancia_ruta, String duracion_ruta)
    {
        super(nombre_pasajero, dni_pasajero, edad_pasajero, sexo_pasajero, nacionalidad_pasajero, id_ticket, precio_ticket, fecha_compra, fecha_salida, numero_asiento, estado_ticekt);
        this.ciudad_origen = ciudad_origen;
        this.ciudad_destino = ciudad_destino;
        this.distancia_ruta = distancia_ruta;
        this.duracion_ruta = duracion_ruta;
    }

    public String getCiudad_origen() {
        return ciudad_origen;
    }

    public void setCiudad_origen(String ciudad_origen) {
        this.ciudad_origen = ciudad_origen;
    }

    public String getCiudad_destino() {
        return ciudad_destino;
    }

    public void setCiudad_destino(String ciudad_destino) {
        this.ciudad_destino = ciudad_destino;
    }

    public Double getDistancia_ruta() {
        return distancia_ruta;
    }

    public void setDistancia_ruta(Double distancia_ruta) {
        this.distancia_ruta = distancia_ruta;
    }

    public String getDuracion_ruta() {
        return duracion_ruta;
    }

    public void setDuracion_ruta(String duracion_ruta) {
        this.duracion_ruta = duracion_ruta;
    }

    public void mostrar_rutas()
    {
        System.out.println("Quito - Guayaquil");
        System.out.println("Precio: $20");
        System.out.println("Quito - Tulcán");
        System.out.println("Precio: $17.50");
        System.out.println("Quito - Puyo");
        System.out.println("Precio: $15");
        System.out.println("Quito - Riobamba");
        System.out.println("Precio: $17.50");

    }
}

