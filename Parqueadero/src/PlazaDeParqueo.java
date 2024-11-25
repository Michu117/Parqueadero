public class PlazaDeParqueo {
    private boolean disponibilidad;
    private String numeroPlaza;

    // Constructor
    public PlazaDeParqueo(String numeroPlaza) {
        this.numeroPlaza = numeroPlaza;
        this.disponibilidad = true; // Disponible por defecto
    }

    // Métodos
    public void marcarOcupada() {
        disponibilidad = false;
    }

    public void marcarDisponible() {
        disponibilidad = true;
    }

    // Getters y Setters
    public boolean isDisponibilidad() { return disponibilidad; }
    public void setDisponibilidad(boolean disponibilidad) { this.disponibilidad = disponibilidad; }

    public String getNumeroPlaza() { return numeroPlaza; }
    public void setNumeroPlaza(String numeroPlaza) { this.numeroPlaza = numeroPlaza; }
}