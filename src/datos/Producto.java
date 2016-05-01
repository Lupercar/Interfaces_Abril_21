package datos;
/*
 * Definimos ciertas propiedades que queremos que se guarden de un Producto
 * como son c�digo, nombre y precio.
 */

public class Producto {
	/*
	 * Para que sea un JavaBean tiene que tener propiedades privadas, 
	 * constructor sin par�metros y getter-setter p�blicos.
	 */
	private int codigo;  
	private String nombre;
	private double precio;
	
	//le ponemos un constructor sin par�metros y otro con par�metros
	public Producto() {
		this(0, "", 0.0);
	}

	public Producto(int codigo, String nombre, double precio) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
	}

	//getter-setter p�blicos
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	} 
}
