/**
 * Clase que modela la entidad Mesero. Es responsable de gestionar el proceso
 * inicial del pedido (toma de pedido, registro en cuenta y generación de orden).
 */
package restaurante;

/**
 * @author G 27 oct 2025
 * Clase Mesero.
 */
public class Mesero {
    // Atributo 'final' que asegura que el nombre del mesero no cambie una vez asignado (inmutabilidad).
    private final String nombre;

    /**
     * Constructor: Inicializa el objeto Mesero con su nombre.
     */
    public Mesero(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método principal de acción del mesero.
     * 1. Registra la acción en consola.
     * 2. Llama a 'cuenta.agregarItem(plato)' para actualizar el total de la cuenta (Delegación de responsabilidad).
     * 3. Crea y retorna un nuevo objeto Orden (Pedido para la cocina).
     * * @param cliente El cliente que pide.
     * @param plato El plato solicitado.
     * @param cuenta La cuenta a la que se añade el plato.
     * @return El objeto Orden generado para la cocina.
     */
    public Orden tomarPedido(Cliente cliente, Plato plato, Cuenta cuenta) {
        System.out.println("\n--- ENTRADA ---");
        System.out.println(nombre + " toma el pedido de " + cliente.getNombre() + ": " + plato.getNombre());
        
        cuenta.agregarItem(plato); // Proceso en Cuenta
        
        return new Orden(cliente, plato); // Genera la Orden
    }
}