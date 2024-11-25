public class ClienteRegular extends Cliente {
    private boolean suscripcionActiva;
    private String metodoPago;

    // Constructor
    public ClienteRegular(String nombre, String apellido, String identificacion, boolean suscripcionActiva, String metodoPago) {
        super(nombre, apellido, identificacion);
        this.suscripcionActiva = suscripcionActiva;
        this.metodoPago = metodoPago;
    }

    // Métodos
    public void realizarReserva() {
        System.out.println("Reserva realizada.");
    }

    public void realizarPago() {
        System.out.println("Pago realizado.");
    }

    // Getters y Setters
    public boolean isSuscripcionActiva() { return suscripcionActiva; }
    public void setSuscripcionActiva(boolean suscripcionActiva) { this.suscripcionActiva = suscripcionActiva; }

    public String getMetodoPago() { return metodoPago; }
    public void setMetodoPago(String metodoPago) { this.metodoPago = metodoPago; }
}