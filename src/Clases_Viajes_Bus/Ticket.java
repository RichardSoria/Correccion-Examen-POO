package Clases_Viajes_Bus;

public class Ticket extends Pasajero
{
    String id_ticket;
    Double precio_ticket;
    String fecha_compra;
    String fecha_salida;
    int numero_asiento;
    Boolean estado_ticekt;

    public Ticket() {}

    public Ticket(String nombre_pasajero, String dni_pasajero, int edad_pasajero, String sexo_pasajero, String nacionalidad_pasajero, String id_ticket, Double precio_ticket, String fecha_compra, String fecha_salida, int numero_asiento, Boolean estado_ticekt)
    {
        super(nombre_pasajero, dni_pasajero, edad_pasajero, sexo_pasajero, nacionalidad_pasajero);
        this.id_ticket = id_ticket;
        this.precio_ticket = precio_ticket;
        this.fecha_compra = fecha_compra;
        this.fecha_salida = fecha_salida;
        this.numero_asiento = numero_asiento;
        this.estado_ticekt = estado_ticekt;
    }

    public String getId_ticket() {
        return id_ticket;
    }

    public void setId_ticket(String id_ticket) {
        this.id_ticket = id_ticket;
    }

    public Double getPrecio_ticket() {
        return precio_ticket;
    }

    public void setPrecio_ticket(Double precio_ticket) {
        this.precio_ticket = precio_ticket;
    }

    public String getFecha_compra() {
        return fecha_compra;
    }

    public void setFecha_compra(String fecha_compra) {
        this.fecha_compra = fecha_compra;
    }

    public String getFecha_salida() {
        return fecha_salida;
    }

    public void setFecha_salida(String fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

    public int getNumero_asiento() {
        return numero_asiento;
    }

    public void setNumero_asiento(int numero_asiento) {
        this.numero_asiento = numero_asiento;
    }

    public Boolean getEstado_ticekt() {
        return estado_ticekt;
    }

    public void setEstado_ticekt(Boolean estado_ticekt) {
        this.estado_ticekt = estado_ticekt;
    }

    public void calcular_costo_pasaje()
    {}

    public  void calcula_servicio_pasaje()
    {}
}
