import java.util.Date;
public class Reserva {
    private PlazaDeParqueo plaza;
    private ClienteRegular cliente;
    private Date fechaReservacion;
    private EstadoReserva estadoReserva;

    // Constructor
    public Reserva(PlazaDeParqueo plaza, ClienteRegular cliente, Date fechaReservacion) {
        this.plaza = plaza;
        this.cliente = cliente;
        this.fechaReservacion = fechaReservacion;
        this.estadoReserva = EstadoReserva.PENDIENTE; // Estado inicial
    }

    // Métodos
    public void confirmarReserva() {
        this.estadoReserva = EstadoReserva.CONFIRMADO;
        System.out.println("Reserva confirmada para el cliente " + cliente.getNombre() + " " + cliente.getApellido());
    }

    public void cancelarReserva() {
        this.estadoReserva = EstadoReserva.CANCELADO;
    }

    public void verificarDisponibilidadPlazas() {
        System.out.println("Verificando disponibilidad de plazas...");
    }

    // Getters y Setters
    public PlazaDeParqueo getPlaza() { return plaza; }
    public void setPlaza(PlazaDeParqueo plaza) { this.plaza = plaza; }

    public ClienteRegular getCliente() { return cliente; }
    public void setCliente(ClienteRegular cliente) { this.cliente = cliente; }

    public Date getFechaReservacion() { return fechaReservacion; }
    public void setFechaReservacion(Date fechaReservacion) { this.fechaReservacion = fechaReservacion; }

    public EstadoReserva getEstadoReserva() { return estadoReserva; }
    public void setEstadoReserva(EstadoReserva estadoReserva) { this.estadoReserva = estadoReserva; }
}