public class Cajero extends Empleado {
    // Constructor
    public Cajero(String nombre, String apellido, String identificacion, String especialidad) {
        super(nombre, apellido, identificacion, especialidad);
    }

    // Métodos adicionales del Cajero
    public void verificarSuscripcion(ClienteRegular cliente) {
        if (cliente.isSuscripcionActiva()) {
            System.out.println("Suscripción activa encontrada.");
        } else {
            System.out.println("No se ha encontrado suscripción activa.");
        }
    }

    public void procesarPago(Factura factura, ClienteRegular cliente) {
        // Verificación de suscripción activa antes de procesar el pago
        if (cliente.isSuscripcionActiva()) {
            System.out.println("El cliente tiene suscripción activa. No se cobrará monto adicional.");
            factura.setMonto(0); // Si tiene suscripción activa, no se cobra monto adicional
        } else {
            System.out.println("Empleado " + getNombre() + " está cobrando la factura de " + factura.getMonto() + "...");
        }

        factura.setEstadoPago(true);
        System.out.println("Factura cobrada.");
    }
}