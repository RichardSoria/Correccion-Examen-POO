package Clases_Viajes_Bus;

public class Normal extends Servicio
{
    String seleccion_Asiento;
    Boolean espacio_maleta;
    Boolean maleta_adicional;
    int cantidad_maleta;
    Double maleta_adicional_costo;

    public Normal() {}

    public Normal(String nombre_pasajero, String dni_pasajero, int edad_pasajero, String sexo_pasajero, String nacionalidad_pasajero, String id_ticket, Double precio_ticket, String fecha_compra, String fecha_salida, int numero_asiento, Boolean estado_ticekt, String ciudad_origen, String ciudad_destino, Double distancia_ruta, String duracion_ruta, String tipo_servicio, Double costo_servicio, Boolean activacion_servicio, String seleccion_Asiento, Boolean espacio_maleta, Boolean maleta_adicional, int cantidad_maleta, Double maleta_adicional_costo)
    {
        super(nombre_pasajero, dni_pasajero, edad_pasajero, sexo_pasajero, nacionalidad_pasajero, id_ticket, precio_ticket, fecha_compra, fecha_salida, numero_asiento, estado_ticekt, ciudad_origen, ciudad_destino, distancia_ruta, duracion_ruta, tipo_servicio, costo_servicio, activacion_servicio);
        this.seleccion_Asiento = seleccion_Asiento;
        this.espacio_maleta = espacio_maleta;
        this.maleta_adicional = maleta_adicional;
        this.cantidad_maleta = cantidad_maleta;
        this.maleta_adicional_costo = maleta_adicional_costo;
    }

    public String getSeleccion_Asiento() {
        return seleccion_Asiento;
    }

    public void setSeleccion_Asiento(String seleccion_Asiento) {
        this.seleccion_Asiento = seleccion_Asiento;
    }

    public Boolean getEspacio_maleta() {
        return espacio_maleta;
    }

    public void setEspacio_maleta(Boolean espacio_maleta) {
        this.espacio_maleta = espacio_maleta;
    }

    public Boolean getMaleta_adicional() {
        return maleta_adicional;
    }

    public void setMaleta_adicional(Boolean maleta_adicional) {
        this.maleta_adicional = maleta_adicional;
    }

    public int getCantidad_maleta() {
        return cantidad_maleta;
    }

    public void setCantidad_maleta(int cantidad_maleta) {
        this.cantidad_maleta = cantidad_maleta;
    }

    public Double getMaleta_adicional_costo() {
        return maleta_adicional_costo;
    }

    public void setMaleta_adicional_costo(Double maleta_adicional_costo) {
        this.maleta_adicional_costo = maleta_adicional_costo;
    }

    @Override
    public void calcular_costo_pasaje()
    {
        if ("Quito" == getCiudad_origen() && "Guayaquil" == getCiudad_destino())
        {
            precio_ticket = 20.00;
             setPrecio_ticket(precio_ticket);

        }

        else if ("Quito" == getCiudad_origen() && "Tulcán"==getCiudad_destino())
        {
           precio_ticket = 17.50;
            setPrecio_ticket(precio_ticket);
        }

        else if ("Quito" == getCiudad_origen() && "Puyo"==getCiudad_destino())
        {
            precio_ticket = 17.50;
            setPrecio_ticket(precio_ticket);
        }
        else if ("Quito" == getCiudad_origen() && "Riobamba"==getCiudad_destino()) {
            precio_ticket = 17.50;
            setPrecio_ticket(precio_ticket);
        }

    }

    @Override public void calcula_costo_maleta_adicional()
    {
        if(getMaleta_adicional() == true)
        {
            maleta_adicional_costo = getCantidad_maleta()*2.00;
            setMaleta_adicional_costo(maleta_adicional_costo);
        }
    }

    public void mostar_datos_ticket_normal()
    {
        System.out.println(getNombre_pasajero());
        System.out.println(getDni_pasajero());
        System.out.println(getEdad_pasajero());
        System.out.println(getSexo_pasajero());
        System.out.println(getNacionalidad_pasajero());
        System.out.println(getId_ticket());
        System.out.println(getPrecio_ticket());
        System.out.println(getFecha_compra());
        System.out.println(getFecha_salida());
        System.out.println(getEstado_ticekt());
        System.out.println(getCiudad_origen());
        System.out.println(getCiudad_destino());
        System.out.println(getDistancia_ruta());
        System.out.println(getDuracion_ruta());
        System.out.println(getTipo_servicio());
        System.out.println(getCosto_servicio());
        System.out.println(getSeleccion_Asiento());
        System.out.println(getCantidad_maleta());
        System.out.println(getMaleta_adicional_costo());
    }
}
