public class Supervisor extends Empleado {
    // Constructor
    public Supervisor(String nombre, String apellido, String identificacion, String especialidad) {
        super(nombre, apellido, identificacion, especialidad);
    }

    // Métodos adicionales del Supervisor
    public void reportarIncidente(String descripcion) {
        System.out.println("Incidente reportado: " + descripcion);
    }

    public boolean verificarPago() {
        return true;
    }
}