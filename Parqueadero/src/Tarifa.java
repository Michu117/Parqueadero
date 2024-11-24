public class Tarifa {
    private String tipoVehiculo;
    private double costoHoras;
    private double costoDia;
    private double costoMes;

    // Constructor
    public Tarifa(String tipoVehiculo, double costoHoras, double costoDia, double costoMes) {
        this.tipoVehiculo = tipoVehiculo;
        this.costoHoras = costoHoras;
        this.costoDia = costoDia;
        this.costoMes = costoMes;
    }

    // Métodos
    public double calcularCosto(double horas) {
        return horas * costoHoras;
    }

    public double calcularCostoDia() {
        return costoDia;
    }

    public double calcularCostoMes() {
        return costoMes;
    }

    // Getters y Setters
    public String getTipoVehiculo() { return tipoVehiculo; }
    public void setTipoVehiculo(String tipoVehiculo) { this.tipoVehiculo = tipoVehiculo; }

    public double getCostoHoras() { return costoHoras; }
    public void setCostoHoras(double costoHoras) { this.costoHoras = costoHoras; }

    public double getCostoDia() { return costoDia; }
    public void setCostoDia(double costoDia) { this.costoDia = costoDia; }

    public double getCostoMes() { return costoMes; }
    public void setCostoMes(double costoMes) { this.costoMes = costoMes; }
}