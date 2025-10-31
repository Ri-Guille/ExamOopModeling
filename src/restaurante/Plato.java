/**
 * Clase que representa un art�culo individual dentro del men� del restaurante.
 */
package restaurante;

/**
 * @author G 27 oct 2025
 * Clase inmutable que define un plato con su nombre y precio.
 */

public class Plato {
    // --- Atributos ---
    
    /**
     * El nombre del plato (ej: "Sopa de Cebolla"). Es final, por lo que no puede cambiar despu�s de la inicializaci�n.
     */
    private final String nombre;
    
    /**
     * El precio del plato. Es final, por lo que su valor se fija al crear el objeto.
     */
    private final double precio;

    // --- Constructor ---
    
    /**
     * Constructor para inicializar un nuevo objeto Plato. 
     * Es la �nica forma de asignar valores a los atributos 'final'.
     * * @param nombre El nombre del plato.
     * @param precio El precio del plato.
     */
    public Plato(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // --- M�todos Getters ---
    
    /**
     * Permite obtener el precio del plato.
     * @return El precio actual del plato.
     */
    public double getPrecio() { 
        return precio; 
    }
    
    /**
     * Permite obtener el nombre del plato.
     * @return El nombre del plato.
     */
    public String getNombre() { 
        return nombre; 
    }

    // --- M�todo toString ---
    
    /**
     * Sobreescribe el m�todo toString() para proporcionar una representaci�n legible del objeto Plato.
     * Es �til para depuraci�n o para mostrar el plato en una interfaz.
     * * @return Una cadena formateada que incluye el nombre y el precio con dos decimales.
     */
    @Override
    public String toString() {
        return nombre + " (�" + String.format("%.2f", precio) + ")";
    }
}