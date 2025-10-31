/**
 * Clase que representa el registro de los platos consumidos por un cliente
 * y calcula el monto total a pagar. En este modelo, la Cuenta act�a como la Orden.
 */
package restaurante;

import java.util.ArrayList; // Necesaria para inicializar la lista de �tems
import java.util.List;    // Interfaz utilizada para la lista de �tems

/**
 * @author G 27 oct 2025
 * Clase responsable de acumular los platos de un cliente y calcular el total.
 */
public class Cuenta {
    // --- Atributos ---
    
    /**
     * Referencia al Cliente que est� asociado a esta cuenta. 
     * Es 'final' porque la cuenta pertenece al cliente desde su creaci�n.
     */
	private final Cliente cliente;
    
    /**
     * Acumulador del precio total de todos los platos agregados a la cuenta.
     * Se inicializa en 0.0 y se actualiza cada vez que se a�ade un plato.
     */
    private double total = 0.0;
    
    /**
     * Lista que almacena todos los objetos Plato que han sido consumidos/ordenados.
     * Es 'final' porque siempre ser� una lista (aunque su contenido cambie).
     */
    private final List<Plato> items = new ArrayList<>();

    // --- Constructor ---
    
    /**
     * Constructor que inicializa la cuenta, asoci�ndola obligatoriamente con un Cliente.
     * @param cliente El objeto Cliente al que se le cargar� esta cuenta.
     */
    public Cuenta(Cliente cliente) {
        this.cliente = cliente;
    }

    // --- M�todos de Proceso ---
    
    /**
     * Agrega un objeto Plato a la lista de �tems y actualiza el total de la cuenta.
     * Este m�todo simula la acci�n de tomar una orden.
     * @param plato El Plato que se a�ade al pedido.
     */
    public void agregarItem(Plato plato) { // PROCESO: Suma al total
        // 1. A�ade la referencia del objeto Plato a la lista de �tems consumidos.
        this.items.add(plato);
        // 2. Acumula el precio del plato al total actual de la cuenta.
        this.total += plato.getPrecio();
    }
    
    // --- M�todos de Salida ---

    /**
     * Imprime el detalle completo de la cuenta, incluyendo el cliente, 
     * todos los �tems consumidos y el total final.
     * (Asume que la clase Cliente tiene un m�todo getDni()).
     */
    public void imprimirCuenta() { // SALIDA
        System.out.println("\n--- CUENTA FINAL - Cliente: " + cliente.getNombre() + " ---");
        // Nota: Si la clase Cliente no tiene getDni(), esta l�nea dar� error.
        System.out.println("  DNI Registrado: " + cliente.getDni()); 
        
        // Itera sobre la lista de �tems e imprime la representaci�n toString() de cada Plato.
        items.forEach(item -> System.out.println("  - " + item));
        
        // Imprime el total final, usando String.format para asegurar dos decimales.
        System.out.printf("  TOTAL FINAL: $%.2f%n", total);
    }
}