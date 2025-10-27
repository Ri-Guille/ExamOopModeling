/**
 * 
 */
package restaurante;

/**
 * @author G 27 oct 2025
 */
public class Cliente {
    // Atributos privados para encapsulamiento
    private int id;
    private String nombre;
    private String dni; // Nuevo campo

    public Cliente(int id, String nombre, String dni) {
        this.id = id;
        this.nombre = nombre;
        this.dni = dni;
        
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
}