package Clases_Viajes_Bus;

public class Servicio extends Ruta {
    String tipo_servicio;
    Double costo_servicio;
    Boolean activacion_servicio;

    public Servicio() {
    }

    public Servicio(String nombre_pasajero, String dni_pasajero, int edad_pasajero, String sexo_pasajero, String nacionalidad_pasajero, String id_ticket, Double precio_ticket, String fecha_compra, String fecha_salida, int numero_asiento, Boolean estado_ticekt, String ciudad_origen, String ciudad_destino, Double distancia_ruta, String duracion_ruta, String tipo_servicio, Double costo_servicio, Boolean activacion_servicio) {
        super(nombre_pasajero, dni_pasajero, edad_pasajero, sexo_pasajero, nacionalidad_pasajero, id_ticket, precio_ticket, fecha_compra, fecha_salida, numero_asiento, estado_ticekt, ciudad_origen, ciudad_destino, distancia_ruta, duracion_ruta);
        this.tipo_servicio = tipo_servicio;
        this.costo_servicio = costo_servicio;
        this.activacion_servicio = activacion_servicio;
    }

    public String getTipo_servicio() {
        return tipo_servicio;
    }

    public void setTipo_servicio(String tipo_servicio) {
        this.tipo_servicio = tipo_servicio;
    }

    public Double getCosto_servicio() {
        return costo_servicio;
    }

    public void setCosto_servicio(Double costo_servicio) {
        this.costo_servicio = costo_servicio;
    }

    public Boolean getActivacion_servicio() {
        return activacion_servicio;
    }

    public void setActivacion_servicio(Boolean activacion_servicio) {
        this.activacion_servicio = activacion_servicio;
    }

    @Override
    public void calcula_servicio_pasaje()
    {
        Double precio_vip;
        costo_servicio = 0.30;
        precio_vip = getPrecio_ticket() + (getPrecio_ticket()*costo_servicio);

    }

    public void calcula_costo_maleta_adicional()
    {}
}
