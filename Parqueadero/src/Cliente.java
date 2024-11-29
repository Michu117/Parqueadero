public class Cliente extends Persona {
    private Vehiculo vehiculo;

    // Constructor
    public Cliente(String nombre, String apellido, String identificacion, Vehiculo vehiculo) {
        super(nombre, apellido, identificacion);
        this.vehiculo = vehiculo;
    }

    public Cliente(String nombre, String apellido, String identificacion) {
        super(nombre, apellido, identificacion);
    }

    // Getters y Setters
    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
}