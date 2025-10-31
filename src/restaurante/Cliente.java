/**
 * Clase principal para representar a un Cliente.
 * Los objetos Cliente son INMUTABLES: sus datos no pueden cambiar después de ser creados.
 */
package restaurante;

/**
 * @author G 27 oct 2025
 */
public class Cliente {
    // Atributos privados para encapsulamiento y FINAL para asegurar la inmutabilidad
    private final int id;
    private final String nombre;
    private final String dni;

    /**
     * Constructor para inicializar el objeto Cliente.
     * Es la única forma de asignar valores.
     */
    public Cliente(int id, String nombre, String dni) {
        this.id = id;
        this.nombre = nombre;
        this.dni = dni;
    }

	/**
	 * Método "getter" para obtener el valor del ID.
	 * @return El ID del cliente.
	 */
	public int getId() {
		return id;
	}

	/**
	 * Método "getter" para obtener el valor del nombre.
	 * @return El nombre del cliente.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Método "getter" para obtener el valor del DNI.
	 * @return El DNI del cliente.
	 */
	public String getDni() {
		return dni;
	}


}