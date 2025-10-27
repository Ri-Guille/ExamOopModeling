/**
 * 
 */
package restaurante;

import java.time.LocalTime;

/**
 * @author G 27 oct 2025
 */
public class Orden {
    private static int contadorId = 1;
    private final int idOrden;
    private final Plato plato;
    private final LocalTime hora;

    public Orden(Cliente cliente, Plato plato) {
        this.idOrden = contadorId++;
        this.plato = plato;
        this.hora = LocalTime.now().withNano(0);
    }

    public void imprimirTicket() { // SALIDA
        System.out.println("\n--- SALIDA (Ticket de Orden #" + idOrden + ") ---");
        System.out.println("Plato: " + plato.getNombre());
        System.out.println("Hora: " + hora);
    }
}
