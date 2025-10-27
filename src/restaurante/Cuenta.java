/**
 * 
 */
package restaurante;

import java.util.ArrayList;
import java.util.List;

/**
 * @author G 27 oct 2025
 */
public class Cuenta {
	private final Cliente cliente;
    private double total = 0.0;
    private final List<Plato> items = new ArrayList<>();

    public Cuenta(Cliente cliente) {
        this.cliente = cliente;
    }

    public void agregarItem(Plato plato) { // PROCESO: Suma al total
        this.items.add(plato);
        this.total += plato.getPrecio();
    }

    public void imprimirCuenta() { // SALIDA
        System.out.println("\n--- CUENTA FINAL - Cliente: " + cliente.getNombre() + " ---");
        System.out.println("  DNI Registrado: " + cliente.getDni());
        items.forEach(item -> System.out.println("  - " + item));
        System.out.printf("  TOTAL FINAL: $%.2f%n",total);;

    }
}
