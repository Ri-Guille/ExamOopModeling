/**
 * 
 */
package restaurante;

/**
 * @author G 27 oct 2025
 */

public class Plato {
    private final String nombre;
    private final double precio;

    public Plato(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public double getPrecio() { return precio; }
    public String getNombre() { return nombre; }

    @Override
    public String toString() {
        return nombre + " (€" + String.format("%.2f", precio) + ")";
    }
}
