public class Visitante extends Cliente {
    private double tiempoUtilizado;

    // Constructor
    public Visitante(String nombre, String apellido, String identificacion, double tiempoUtilizado) {
        super(nombre, apellido, identificacion);
        this.tiempoUtilizado = tiempoUtilizado;
    }

    // Métodos
    public void realizarReserva() {
        System.out.println("Reserva realizada.");
    }
    public void realizarPago() {
        System.out.println("Pago realizado.");
    }

    // Getters y Setters
    public double getTiempoUtilizado() { return tiempoUtilizado; }
    public void setTiempoUtilizado(double tiempoUtilizado) { this.tiempoUtilizado = tiempoUtilizado; }
}