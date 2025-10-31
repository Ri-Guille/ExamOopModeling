/**
 * Clase que modela la entidad Orden (el pedido enviado a la cocina).
 * Su principal rol es registrar qu� plato se pidi� y cu�ndo, sirviendo como
 * comprobante log�stico para el proceso de preparaci�n.
 */
package restaurante;

import java.time.LocalTime; // Necesario para registrar la hora exacta del pedido.

/**
 * @author G 27 oct 2025
 * Clase Orden (Pedido).
 */
public class Orden {
    // Atributo est�tico: Contador global que se incrementa con cada nueva orden
    // para asegurar que cada orden tenga un ID �nico.
    private static int contadorId = 1;

    // Atributos privados y 'final' para asegurar la inmutabilidad de la orden.
    private final int idOrden;     // Identificador �nico de esta orden.
    private final Plato plato;     // Referencia al plato solicitado (�Qui�n lo pidi� no es esencial aqu�?).
    private final LocalTime hora;  // Hora exacta en que se cre� la orden.

    /**
     * Constructor: Crea una nueva Orden.
     * @param cliente El cliente que hizo la orden (aunque no se almacena, puede ser �til para contexto).
     * @param plato El objeto Plato solicitado.
     */
    public Orden(Cliente cliente, Plato plato) {
        // Asigna el ID actual y luego incrementa el contador para la pr�xima orden.
        this.idOrden = contadorId++; 
        this.plato = plato;
        // Captura la hora actual del sistema, eliminando los nanosegundos para un formato m�s limpio.
        this.hora = LocalTime.now().withNano(0);
    }

    /**
     * M�todo de SALIDA: Simula la impresi�n de un ticket o comanda para la cocina/servicio.
     */
    public void imprimirTicket() { 
        System.out.println("\n--- SALIDA (Ticket de Orden #" + idOrden + ") ---");
        System.out.println("Plato: " + plato.getNombre());
        System.out.println("Hora: " + hora);
    }
    // Nota: Esta clase no tiene getters ni setters, lo cual refuerza su naturaleza como un registro inmutable.
}