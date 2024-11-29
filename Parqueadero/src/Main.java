import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido al sistema de parqueadero!");
        // Creación de un vehículo
        Vehiculo vehiculo = new Automovil("ABC123", "Toyota", "Rojo");
        // Creación de un cliente con suscripción activa
        ClienteRegular cliente = new ClienteRegular("Fabricio", "Ruiz", "1234567890", true, "Tarjeta de Crédito");
        // Usar los setters para modificar los valores

        Factura Factura = new Factura("001", 117.0f, cliente.getNombre() + " " + cliente.getApellido(), new Date(), TipoFactura.FISICA);

        // Declaración de cajero como un Cajero directamente
        Cajero cajero = new Cajero("Alicia", "Alvarado", "0987654321", "Cajero");

        // Creación de una reserva y confirmación
        PlazaDeParqueo plaza = new PlazaDeParqueo("A1");
        Reserva reserva = new Reserva(plaza, cliente, new Date());
        reserva.confirmarReserva();

        // Mostrar factura
        Factura.generarFactura();
        Factura.imprimirFactura();

        // Procesar Pago
        cajero.trabajar();
        cajero.procesarPago(Factura, cliente);

        // Verificar suscripción
        cajero.verificarSuscripcion(cliente);

        // Mostrar estado de la reserva
        System.out.println("Estado de la reserva: " + reserva.getEstadoReserva());

        System.out.println("¡Gracias por preferirnos!");
        System.out.println("Vuelva pronto.");
    }
}
