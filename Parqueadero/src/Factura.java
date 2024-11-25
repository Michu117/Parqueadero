import java.util.Date;

// Clase Factura
public class Factura {
    private String numeroFactura;
    private float monto;
    private String nombreCliente;
    private Date fecha;
    private boolean estadoPago; // true = pagada, false = pendiente
    private TipoFactura tipoFactura;

    // Constructor
    public Factura(String numeroFactura, float monto, String nombreCliente, Date fecha, TipoFactura tipoFactura) {
        this.numeroFactura = numeroFactura;
        this.monto = monto;
        this.nombreCliente = nombreCliente;
        this.fecha = fecha;
        this.tipoFactura = tipoFactura;
        this.estadoPago = false; // Pago pendiente al inicio
    }

    // Métodos
    public void generarFactura() {
        System.out.println("Generando factura...");
    }

    public void imprimirFactura() {
        System.out.println("Factura de " + nombreCliente);
        System.out.println("Tipo de Factura: " + tipoFactura);
        System.out.println("Monto: " + monto);
        System.out.println("Estado de Pago: " + (estadoPago ? "Pagada" : "Pendiente"));
    }

    public void enviarFactura() {
        System.out.println("Enviando factura...");
    }

    // Getters y Setters
    public String getNumeroFactura() { return numeroFactura; }
    public void setNumeroFactura(String numeroFactura) { this.numeroFactura = numeroFactura; }

    public float getMonto() { return monto; }
    public void setMonto(float monto) { this.monto = monto; }

    public String getNombreCliente() { return nombreCliente; }
    public void setNombreCliente(String nombreCliente) { this.nombreCliente = nombreCliente; }

    public Date getFecha() { return fecha; }
    public void setFecha(Date fecha) { this.fecha = fecha; }

    public boolean isEstadoPago() { return estadoPago; }
    public void setEstadoPago(boolean estadoPago) { this.estadoPago = estadoPago; }

    public TipoFactura getTipoFactura() { return tipoFactura; }
    public void setTipoFactura(TipoFactura tipoFactura) { this.tipoFactura = tipoFactura; }
}