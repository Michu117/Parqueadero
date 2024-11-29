public abstract class Empleado extends Persona implements IContrato {
    private String especialidad;

    // Constructor
    public Empleado(String nombre, String apellido, String identificacion, String especialidad) {
        super(nombre, apellido, identificacion);
        this.especialidad = especialidad;
    }

    // Implementación del método trabajar
    @Override
    public void trabajar() {
        System.out.println("El empleado " + nombre + " está trabajando.");
    }

    // Getters y Setters
    public String getEspecialidad() { return especialidad; }
    public void setEspecialidad(String especialidad) { this.especialidad = especialidad; }
}