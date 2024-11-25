import java.util.List;

public class Parqueadero {
    private String nombre;
    private String direccion;
    private int numeroPisos;
    private List<Piso> pisos;
    private List<Vehiculo> vehiculos;
    private List<Empleado> empleados;
    private List<Cliente> clientes;

    // Constructor
    public Parqueadero(String nombre, String direccion, int numeroPisos) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.numeroPisos = numeroPisos;
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    public int getNumeroPisos() { return numeroPisos; }
    public void setNumeroPisos(int numeroPisos) { this.numeroPisos = numeroPisos; }

    public List<Piso> getPisos() { return pisos; }
    public void setPisos(List<Piso> pisos) { this.pisos = pisos; }

    public List<Vehiculo> getVehiculos() { return vehiculos; }
    public void setVehiculos(List<Vehiculo> vehiculos) { this.vehiculos = vehiculos; }

    public List<Empleado> getEmpleados() { return empleados; }
    public void setEmpleados(List<Empleado> empleados) { this.empleados = empleados; }

    public List<Cliente> getClientes() { return clientes; }
    public void setClientes(List<Cliente> clientes) { this.clientes = clientes; }
}
