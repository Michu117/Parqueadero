public class Visitante extends Cliente {
    private double tiempoUtilizado;

    // Constructor
    public Visitante(String nombre, String apellido, String identificacion, double tiempoUtilizado) {
        super(nombre, apellido, identificacion);
        this.tiempoUtilizado = tiempoUtilizado;
    }

    // Getters y Setters
    public double getTiempoUtilizado() { return tiempoUtilizado; }
    public void setTiempoUtilizado(double tiempoUtilizado) { this.tiempoUtilizado = tiempoUtilizado; }
}