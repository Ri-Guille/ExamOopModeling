/**
 * 
 */
package restaurante;

/**
 * @author G 27 oct 2025
 */
public class Mesero {
    private final String nombre;

    public Mesero(String nombre) {
        this.nombre = nombre;
    }

    // ENTRADA & PROCESO: Toma pedido, lo registra en Cuenta y genera Orden
    public Orden tomarPedido(Cliente cliente, Plato plato, Cuenta cuenta) {
        System.out.println("\n--- ENTRADA ---");
        System.out.println(nombre + " toma el pedido de " + cliente.getNombre() + ": " + plato.getNombre());
        
        cuenta.agregarItem(plato); // Proceso en Cuenta
        
        return new Orden(cliente, plato); // Genera la Orden
}
    }