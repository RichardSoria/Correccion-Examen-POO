package Clases_Viajes_Bus;

public class VIP extends Servicio {
    String seleccion_Asiento;
    Boolean servicio_asiento;
    Boolean servicio_internet;
    Boolean servicio_comida;
    Boolean servicio_videojuegos;
    Boolean espacio_maleta;
    Boolean maleta_adicional;
    int cantidad_maleta_adicional;
    Double maleta_adicional_costo;

    public VIP() {}

    public VIP(String nombre_pasajero, String dni_pasajero, int edad_pasajero, String sexo_pasajero, String nacionalidad_pasajero, String id_ticket, Double precio_ticket, String fecha_compra, String fecha_salida, int numero_asiento, Boolean estado_ticekt, String ciudad_origen, String ciudad_destino, Double distancia_ruta, String duracion_ruta, String tipo_servicio, Double costo_servicio, Boolean activacion_servicio, String seleccion_Asiento, Boolean servicio_asiento, Boolean servicio_internet, Boolean servicio_comida, Boolean servicio_videojuegos, Boolean espacio_maleta, Boolean maleta_adicional, int cantidad_maleta_adicional, Double maleta_adicional_costo) {
        super(nombre_pasajero, dni_pasajero, edad_pasajero, sexo_pasajero, nacionalidad_pasajero, id_ticket, precio_ticket, fecha_compra, fecha_salida, numero_asiento, estado_ticekt, ciudad_origen, ciudad_destino, distancia_ruta, duracion_ruta, tipo_servicio, costo_servicio, activacion_servicio);
        this.seleccion_Asiento = seleccion_Asiento;
        this.servicio_asiento = servicio_asiento;
        this.servicio_internet = servicio_internet;
        this.servicio_comida = servicio_comida;
        this.servicio_videojuegos = servicio_videojuegos;
        this.espacio_maleta = espacio_maleta;
        this.maleta_adicional = maleta_adicional;
        this.cantidad_maleta_adicional = cantidad_maleta_adicional;
        this.maleta_adicional_costo = maleta_adicional_costo;
    }

    public String getSeleccion_Asiento() {
        return seleccion_Asiento;
    }

    public void setSeleccion_Asiento(String seleccion_Asiento) {
        this.seleccion_Asiento = seleccion_Asiento;
    }

    public Boolean getServicio_asiento() {
        return servicio_asiento;
    }

    public void setServicio_asiento(Boolean servicio_asiento) {
        this.servicio_asiento = servicio_asiento;
    }

    public Boolean getServicio_internet() {
        return servicio_internet;
    }

    public void setServicio_internet(Boolean servicio_internet) {
        this.servicio_internet = servicio_internet;
    }

    public Boolean getServicio_comida() {
        return servicio_comida;
    }

    public void setServicio_comida(Boolean servicio_comida) {
        this.servicio_comida = servicio_comida;
    }

    public Boolean getServicio_videojuegos() {
        return servicio_videojuegos;
    }

    public void setServicio_videojuegos(Boolean servicio_videojuegos) {
        this.servicio_videojuegos = servicio_videojuegos;
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

    public Double getMaleta_adicional_costo() {
        return maleta_adicional_costo;
    }

    public void setMaleta_adicional_costo(Double maleta_adicional_costo) {
        this.maleta_adicional_costo = maleta_adicional_costo;
    }

    public int getCantidad_maleta_adicional() {
        return cantidad_maleta_adicional;
    }

    public void setCantidad_maleta_adicional(int cantidad_maleta_adicional) {
        this.cantidad_maleta_adicional = cantidad_maleta_adicional;
    }

    @Override
    public void calcular_costo_pasaje() {
        if ("Quito".equals(getCiudad_origen()) && "Guayaquil".equals(getCiudad_destino())) {
            precio_ticket = 20.00;
            setPrecio_ticket(precio_ticket);

        } else if ("Quito".equals(getCiudad_origen()) && "Tulcán".equals(getCiudad_destino())) {
            precio_ticket = 17.50;
            setPrecio_ticket(precio_ticket);
        } else if ("Quito".equals(getCiudad_origen()) && "Puyo".equals(getCiudad_destino())) {
            precio_ticket = 15.00;
            setPrecio_ticket(precio_ticket);
        } else if ("Quito".equals(getCiudad_origen()) && "Riobamba".equals(getCiudad_destino())) {
            precio_ticket = 17.50;
            setPrecio_ticket(precio_ticket);
        }
    }

    @Override
    public void calcula_costo_maleta_adicional() {
        if (getMaleta_adicional()) {
            maleta_adicional_costo = getCantidad_maleta_adicional() * 2.00;
            setMaleta_adicional_costo(maleta_adicional_costo);
        }

    }

    public void mostar_datos_ticket_vip() {
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
        System.out.println(getCantidad_maleta_adicional());
        System.out.println(getMaleta_adicional_costo());
    }
}
