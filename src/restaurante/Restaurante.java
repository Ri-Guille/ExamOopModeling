/**
 * Clase principal que contiene el método main.
 * Su objetivo es simular el flujo de trabajo de un restaurante: 
 * inicializar objetos, tomar pedidos y generar la cuenta.
 */
package restaurante;

/**
 * @author G 27 oct 2025
 * Clase de simulación y prueba del sistema de modelado OOP.
 */
public class Restaurante {
    
    /**
     * Punto de entrada de la aplicación Java.
     * @param args Argumentos de la línea de comandos (no utilizados aquí).
     */
    public static void main(String[] args) {
        
        // 1. INICIALIZACIÓN DE OBJETOS BÁSICOS
        
        // Crea una instancia de Mesero con el nombre "Roberto".
        Mesero mesero = new Mesero("Roberto");
        
        // Crea dos instancias de Plato (ítems del menú) con su nombre y precio fijo.
        Plato hamburguesa = new Plato("Hamburguesa Gourmet", 15.75);
        Plato refresco = new Plato("Refresco Cola", 3.50);
        
        // --- ENTRADA (Creación de Cliente Directa y Final) ---
        
        // Crea una instancia de Cliente con su ID, nombre y DNI (o similar).
        // Se asume que la clase Cliente existe y tiene el constructor adecuado.
        Cliente clienteLaura = new Cliente(201, "Laura Pérez", "54123456C");
        
        // Crea una instancia de Cuenta asociada al cliente Laura. 
        // Esta cuenta acumulará todos sus pedidos.
        Cuenta cuentaLaura = new Cuenta(clienteLaura);

        System.out.println("--- INICIO DE ORDEN ---");
        System.out.println("Cliente registrado: " + clienteLaura.getNombre() + " (ID: " + clienteLaura.getId() + ")");
        System.out.println("-------------------------");

        // 2. FLUJO DE PEDIDO (PROCESO)
        
        // Se llama al método tomarPedido del Mesero. 
        // Se asume que este método crea un objeto Orden y añade el plato a la Cuenta.
        
        // Orden 1: Hamburguesa
        Orden orden1 = mesero.tomarPedido(clienteLaura, hamburguesa, cuentaLaura);
        // Imprime el detalle específico de esta orden individual (ticket).
        orden1.imprimirTicket(); // SALIDA 1a
        
        // Orden 2: Refresco
        Orden orden2 = mesero.tomarPedido(clienteLaura, refresco, cuentaLaura);
        // Imprime el detalle específico de esta segunda orden individual.
        orden2.imprimirTicket(); // SALIDA 2a

        // 3. SALIDA FINAL (Cuenta total)
        
        // Llama al método de la Cuenta para imprimir el resumen total de todos los pedidos.
        // Muestra los ítems agregados y el total acumulado.
        cuentaLaura.imprimirCuenta();
    }
}