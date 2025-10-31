/**
 * Clase que representa el registro de los platos consumidos por un cliente
 * y calcula el monto total a pagar. En este modelo, la Cuenta actúa como la Orden.
 */
package restaurante;

import java.util.ArrayList; // Necesaria para inicializar la lista de ítems
import java.util.List;    // Interfaz utilizada para la lista de ítems

/**
 * @author G 27 oct 2025
 * Clase responsable de acumular los platos de un cliente y calcular el total.
 */
public class Cuenta {
    // --- Atributos ---
    
    /**
     * Referencia al Cliente que está asociado a esta cuenta. 
     * Es 'final' porque la cuenta pertenece al cliente desde su creación.
     */
	private final Cliente cliente;
    
    /**
     * Acumulador del precio total de todos los platos agregados a la cuenta.
     * Se inicializa en 0.0 y se actualiza cada vez que se añade un plato.
     */
    private double total = 0.0;
    
    /**
     * Lista que almacena todos los objetos Plato que han sido consumidos/ordenados.
     * Es 'final' porque siempre será una lista (aunque su contenido cambie).
     */
    private final List<Plato> items = new ArrayList<>();

    // --- Constructor ---
    
    /**
     * Constructor que inicializa la cuenta, asociándola obligatoriamente con un Cliente.
     * @param cliente El objeto Cliente al que se le cargará esta cuenta.
     */
    public Cuenta(Cliente cliente) {
        this.cliente = cliente;
    }

    // --- Métodos de Proceso ---
    
    /**
     * Agrega un objeto Plato a la lista de ítems y actualiza el total de la cuenta.
     * Este método simula la acción de tomar una orden.
     * @param plato El Plato que se añade al pedido.
     */
    public void agregarItem(Plato plato) { // PROCESO: Suma al total
        // 1. Añade la referencia del objeto Plato a la lista de ítems consumidos.
        this.items.add(plato);
        // 2. Acumula el precio del plato al total actual de la cuenta.
        this.total += plato.getPrecio();
    }
    
    // --- Métodos de Salida ---

    /**
     * Imprime el detalle completo de la cuenta, incluyendo el cliente, 
     * todos los ítems consumidos y el total final.
     * (Asume que la clase Cliente tiene un método getDni()).
     */
    public void imprimirCuenta() { // SALIDA
        System.out.println("\n--- CUENTA FINAL - Cliente: " + cliente.getNombre() + " ---");
        // Nota: Si la clase Cliente no tiene getDni(), esta línea dará error.
        System.out.println("  DNI Registrado: " + cliente.getDni()); 
        
        // Itera sobre la lista de ítems e imprime la representación toString() de cada Plato.
        items.forEach(item -> System.out.println("  - " + item));
        
        // Imprime el total final, usando String.format para asegurar dos decimales.
        System.out.printf("  TOTAL FINAL: $%.2f%n", total);
    }
}