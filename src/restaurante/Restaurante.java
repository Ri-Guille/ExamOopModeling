/**
 * 
 */
package restaurante;

/**
 * @author G 27 oct 2025
 */
public class Restaurante {
    public static void main(String[] args) {
        
        // 1. INICIALIZACIÓN
        Mesero mesero = new Mesero("Roberto");
        Plato hamburguesa = new Plato("Hamburguesa Gourmet", 15.75);
        Plato refresco = new Plato("Refresco Cola", 3.50);
        
        // --- ENTRADA (Creación de Cliente Directa y Final) ---
        // El cliente se crea con todos sus datos definitivos, eliminando la etapa temporal.
        Cliente clienteLaura = new Cliente(201, "Laura Pérez", "54123456C");
        Cuenta cuentaLaura = new Cuenta(clienteLaura);

        System.out.println("--- INICIO DE ORDEN ---");
        System.out.println("Cliente registrado: " + clienteLaura.getNombre() + " (ID: " + clienteLaura.getId() + ")");
        System.out.println("-------------------------");

        // 2. FLUJO DE PEDIDO (PROCESO)
        
        // Orden 1: Hamburguesa
        Orden orden1 = mesero.tomarPedido(clienteLaura, hamburguesa, cuentaLaura);
        orden1.imprimirTicket(); // SALIDA 1a
        
        // Orden 2: Refresco
        Orden orden2 = mesero.tomarPedido(clienteLaura, refresco, cuentaLaura);
        orden2.imprimirTicket(); // SALIDA 2a

        // 3. SALIDA FINAL (Cuenta total)
        cuentaLaura.imprimirCuenta();
    }
}