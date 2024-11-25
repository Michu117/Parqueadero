import java.util.ArrayList;
import java.util.List;

// Clase Piso
public class Piso {
    private int numero; // Número del piso (1, 2, 3, etc.)
    private int capacidadTotal; // Capacidad total de plazas en el piso
    private List<PlazaDeParqueo> plazasDeParqueo; // Lista de plazas de estacionamiento

    // Constructor
    public Piso(int numero, int capacidadTotal) {
        this.numero = numero;
        this.capacidadTotal = capacidadTotal;
        this.plazasDeParqueo = new ArrayList<>();
    }

    // Métodos
    public void agregarPlazaDeParqueo(PlazaDeParqueo plaza) {
        if (plazasDeParqueo.size() < capacidadTotal) {
            plazasDeParqueo.add(plaza);
            System.out.println("Plaza de parqueo " + plaza.getNumeroPlaza() + " agregada al piso " + numero);
        } else {
            System.out.println("No se pueden agregar más plazas, capacidad máxima alcanzada.");
        }
    }

    public void eliminarPlazaDeParqueo(String numeroPlaza) {
        PlazaDeParqueo plazaEncontrada = null;
        for (PlazaDeParqueo plaza : plazasDeParqueo) {
            if (plaza.getNumeroPlaza().equals(numeroPlaza)) {
                plazaEncontrada = plaza;
                break;
            }
        }
        if (plazaEncontrada != null) {
            plazasDeParqueo.remove(plazaEncontrada);
            System.out.println("Plaza de parqueo " + numeroPlaza + " eliminada del piso " + numero);
        } else {
            System.out.println("Plaza de parqueo " + numeroPlaza + " no encontrada en el piso " + numero);
        }
    }

    public PlazaDeParqueo buscarPlazaDisponible() {
        for (PlazaDeParqueo plaza : plazasDeParqueo) {
            if (plaza.isDisponibilidad()) {
                return plaza;
            }
        }
        System.out.println("No hay plazas disponibles en el piso " + numero);
        return null;
    }

    public void mostrarDisponibilidad() {
        System.out.println("Disponibilidad en el piso " + numero + ":");
        for (PlazaDeParqueo plaza : plazasDeParqueo) {
            String estado = plaza.isDisponibilidad() ? "Disponible" : "Ocupada";
            System.out.println("Plaza " + plaza.getNumeroPlaza() + " - " + estado);
        }
    }

    // Getters y Setters
    public int getNumero() { return numero; }
    public void setNumero(int numero) { this.numero = numero; }

    public int getCapacidadTotal() { return capacidadTotal; }
    public void setCapacidadTotal(int capacidadTotal) { this.capacidadTotal = capacidadTotal; }

    public List<PlazaDeParqueo> getPlazasDeParqueo() { return plazasDeParqueo; }
    public void setPlazasDeParqueo(List<PlazaDeParqueo> plazasDeParqueo) { this.plazasDeParqueo = plazasDeParqueo; }
}
