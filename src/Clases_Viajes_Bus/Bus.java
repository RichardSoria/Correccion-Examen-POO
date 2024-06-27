package Clases_Viajes_Bus;

public class Bus {
    private String placa;
    private String modelo;
    private int capacidad;
    private Chofer chofer;
    private Ruta ruta;

    public Bus(String placa, String modelo, int capacidad, Chofer chofer, Ruta ruta) {
        this.placa = placa;
        this.modelo = modelo;
        this.capacidad = capacidad;
        this.chofer = chofer;
        this.ruta = ruta;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public Chofer getChofer() {
        return chofer;
    }

    public void setChofer(Chofer chofer) {
        this.chofer = chofer;
    }

    public Ruta getRuta() {
        return ruta;
    }

    public void setRuta(Ruta ruta) {
        this.ruta = ruta;
    }

    public void mostrarInfo() {
        System.out.println("Placa: " + placa);
        System.out.println("Modelo: " + modelo);
        System.out.println("Capacidad: " + capacidad);
    }
}
