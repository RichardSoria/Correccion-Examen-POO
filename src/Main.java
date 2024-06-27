import Clases_Viajes_Bus.Normal;
import Clases_Viajes_Bus.VIP;

public class Main
{
    public static void main(String[] args)
    {
        Normal normal_1 = new Normal();
        Normal normal_2 = new Normal();
        Normal normal_3 = new Normal();
        VIP vip_1 = new VIP();
        VIP vip_2 = new VIP();

        normal_1.setNombre_pasajero("Juan Perez");
        normal_1.setDni_pasajero("1234567890");
        normal_1.setEdad_pasajero(30);
        normal_1.setSexo_pasajero("Masculino");
        normal_1.setNacionalidad_pasajero("Ecuatoriano");
        normal_1.setId_ticket("T123456");
        normal_1.setPrecio_ticket(20.00);
        normal_1.setFecha_compra("2024-06-14");
        normal_1.setFecha_salida("2024-06-15");
        normal_1.setNumero_asiento(10);
        normal_1.setEstado_ticekt(true);
        normal_1.setCiudad_origen("Quito");
        normal_1.setCiudad_destino("Guayaquil");
        normal_1.setDistancia_ruta(300.0);
        normal_1.setDuracion_ruta("8 horas");
        normal_1.setTipo_servicio("Normal");
        normal_1.setCosto_servicio(0.0);
        normal_1.setActivacion_servicio(true);
        normal_1.setSeleccion_Asiento("A1");
        normal_1.setEspacio_maleta(true);
        normal_1.setMaleta_adicional(false);
        normal_1.setCantidad_maleta(1);
        normal_1.setMaleta_adicional_costo(0.0);

        normal_2.setNombre_pasajero("Ana Silva");
        normal_2.setDni_pasajero("5678901234");
        normal_2.setEdad_pasajero(35);
        normal_2.setSexo_pasajero("Femenino");
        normal_2.setNacionalidad_pasajero("Ecuatoriana");
        normal_2.setId_ticket("T987654");
        normal_2.setPrecio_ticket(17.50);
        normal_2.setFecha_compra("2024-06-15");
        normal_2.setFecha_salida("2024-06-18");
        normal_2.setNumero_asiento(20);
        normal_2.setEstado_ticekt(true);
        normal_2.setCiudad_origen("Quito");
        normal_2.setCiudad_destino("Tulcán");
        normal_2.setDistancia_ruta(247.0);
        normal_2.setDuracion_ruta("4 horas");
        normal_2.setTipo_servicio("Normal");
        normal_2.setCosto_servicio(0.0);
        normal_2.setActivacion_servicio(true);
        normal_2.setSeleccion_Asiento("C5");
        normal_2.setEspacio_maleta(true);
        normal_2.setMaleta_adicional(false);
        normal_2.setCantidad_maleta(1);
        normal_2.setMaleta_adicional_costo(0.0);

        normal_3.setNombre_pasajero("Pedro Ramírez");
        normal_3.setDni_pasajero("0987654321");
        normal_3.setEdad_pasajero(28);
        normal_3.setSexo_pasajero("Masculino");
        normal_3.setNacionalidad_pasajero("Ecuatoriano");
        normal_3.setId_ticket("T654321");
        normal_3.setPrecio_ticket(15.00);
        normal_3.setFecha_compra("2024-06-14");
        normal_3.setFecha_salida("2024-06-17");
        normal_3.setNumero_asiento(15);
        normal_3.setEstado_ticekt(true);
        normal_3.setCiudad_origen("Quito");
        normal_3.setCiudad_destino("Puyo");
        normal_3.setDistancia_ruta(185.0);
        normal_3.setDuracion_ruta("6 horas");
        normal_3.setTipo_servicio("Normal");
        normal_3.setCosto_servicio(0.0);
        normal_3.setActivacion_servicio(true);
        normal_3.setSeleccion_Asiento("B3");
        normal_3.setEspacio_maleta(true);
        normal_3.setMaleta_adicional(false);
        normal_3.setCantidad_maleta(1);
        normal_3.setMaleta_adicional_costo(0.0);

        vip_1.setNombre_pasajero("María López");
        vip_1.setDni_pasajero("1122334455");
        vip_1.setEdad_pasajero(40);
        vip_1.setSexo_pasajero("Femenino");
        vip_1.setNacionalidad_pasajero("Ecuatoriana");
        vip_1.setId_ticket("T112233");
        vip_1.setPrecio_ticket(17.50);
        vip_1.setFecha_compra("2024-06-17");
        vip_1.setFecha_salida("2024-06-19");
        vip_1.setNumero_asiento(5);
        vip_1.setEstado_ticekt(true);
        vip_1.setCiudad_origen("Quito");
        vip_1.setCiudad_destino("Riobamba");
        vip_1.setDistancia_ruta(200.0);
        vip_1.setDuracion_ruta("4 horas");
        vip_1.setTipo_servicio("VIP");
        vip_1.setCosto_servicio(0.0);
        vip_1.setActivacion_servicio(true);
        vip_1.setSeleccion_Asiento("A1");
        vip_1.setServicio_asiento(true);
        vip_1.setServicio_internet(true);
        vip_1.setServicio_comida(true);
        vip_1.setServicio_videojuegos(true);
        vip_1.setEspacio_maleta(true);
        vip_1.setMaleta_adicional(true);
        vip_1.setCantidad_maleta_adicional(2);
        vip_1.setMaleta_adicional_costo(4.0);

        vip_2.setNombre_pasajero("Carlos Rodríguez");
        vip_2.setDni_pasajero("9988776655");
        vip_2.setEdad_pasajero(45);
        vip_2.setSexo_pasajero("Masculino");
        vip_2.setNacionalidad_pasajero("Ecuatoriano");
        vip_2.setId_ticket("T998877");
        vip_2.setPrecio_ticket(20.00);
        vip_2.setFecha_compra("2024-06-16");
        vip_2.setFecha_salida("2024-06-20");
        vip_2.setNumero_asiento(2);
        vip_2.setEstado_ticekt(true);
        vip_2.setCiudad_origen("Quito");
        vip_2.setCiudad_destino("Guayaquil");
        vip_2.setDistancia_ruta(300.0);
        vip_2.setDuracion_ruta("8 horas");
        vip_2.setTipo_servicio("VIP");
        vip_2.setCosto_servicio(0.0);
        vip_2.setActivacion_servicio(true);
        vip_2.setSeleccion_Asiento("A2");
        vip_2.setServicio_asiento(true);
        vip_2.setServicio_internet(true);
        vip_2.setServicio_comida(true);
        vip_2.setServicio_videojuegos(true);
        vip_2.setEspacio_maleta(true);
        vip_2.setMaleta_adicional(true);
        vip_2.setCantidad_maleta_adicional(3);
        vip_2.setMaleta_adicional_costo(6.0);

        normal_1.mostar_datos_ticket_normal();
        normal_1.calcula_costo_maleta_adicional();
        System.out.println();

        normal_2.mostar_datos_ticket_normal();
        normal_2.calcula_costo_maleta_adicional();
        System.out.println();

        normal_3.mostar_datos_ticket_normal();
        normal_3.calcula_costo_maleta_adicional();
        System.out.println();

        vip_1.mostar_datos_ticket_vip();
        vip_1.calcula_costo_maleta_adicional();
        System.out.println();

        vip_2.mostar_datos_ticket_vip();
        vip_2.calcula_costo_maleta_adicional();
        System.out.println();


        Normal normal_4 = new Normal("Laura Torres", "2233445566", 26, "Femenino", "Ecuatoriana", "T445566", 15.00, "2024-06-12", "2024-06-16", 12, true, "Quito", "Puyo", 185.0, "6 horas", "Normal", 0.0, true, "B4", true, false, 1, 0.0);
        Normal normal_5 = new Normal("Miguel Angel", "3344556677", 31, "Masculino", "Ecuatoriano", "T556677", 17.50, "2024-06-13", "2024-06-17", 18, true, "Quito", "Riobamba", 200.0, "4 horas", "Normal", 0.0, true, "C1", true, false, 1, 0.0);
        Normal normal_6 = new Normal("Patricia Jimenez", "4455667788", 29, "Femenino", "Ecuatoriana", "T667788", 20.00, "2024-06-14", "2024-06-18", 22, true, "Quito", "Guayaquil", 300.0, "8 horas", "Normal", 0.0, true, "D2", true, false, 1, 0.0);

        VIP vip_3 = new VIP("Luis Martinez", "5566778899", 38, "Masculino", "Ecuatoriano", "T778899", 20.00, "2024-06-15", "2024-06-19", 7, true, "Quito", "Guayaquil", 300.0, "8 horas", "VIP", 0.0, true, "A3", true, true, true, true, true, true, 2, 4.0);
        VIP vip_4 = new VIP("Andrea Fernández", "6677889900", 33, "Femenino", "Ecuatoriana", "T889900", 17.50, "2024-06-16", "2024-06-20", 9, true, "Quito", "Riobamba", 200.0, "4 horas", "VIP", 0.0, true, "A4", true, true, true, true, true, true, 1, 2.0);

        normal_4.mostar_datos_ticket_normal();
        normal_4.calcula_costo_maleta_adicional();
        System.out.println();

        normal_5.mostar_datos_ticket_normal();
        normal_5.calcula_costo_maleta_adicional();
        System.out.println();

        normal_6.mostar_datos_ticket_normal();
        normal_6.calcula_costo_maleta_adicional();
        System.out.println();

        vip_3.mostar_datos_ticket_vip();
        vip_3.calcula_costo_maleta_adicional();
        System.out.println();

        vip_4.mostar_datos_ticket_vip();
        vip_4.calcular_costo_pasaje();
        System.out.println();


    }
}