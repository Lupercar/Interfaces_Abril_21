package datos;
/*
 * Definimos ciertas propiedades que queremos que se guarden de un Producto
 * como son código, nombre y precio.
 */

import datos.interfaces.Ordenable;

public class Producto implements Ordenable {
	/*
	 * Para que sea un JavaBean tiene que tener propiedades privadas,
	 * constructor sin parámetros y getter-setter públicos.
	 */
	private int codigo;
	private String nombre;
	private double precio;

	// le ponemos un constructor sin parámetros y otro con parámetros
	public Producto() {
		this(0, "", 0.0);
	}

	public Producto(int codigo, String nombre, double precio) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
	}

	// getter-setter públicos
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

	@Override
	public Tipo ordena(Ordenable o) {
		// Comparara el precio del objeto donde estamos con el precio del que le
		// pasamos y devuelve
		// MENOR si this.precio es más pequeño que o.precio.
		// IGUAl si this.precio == o.precio
		// MAYOR si this.precio > o.precio

		Tipo ret = Tipo.INDEFINIDO; // Valor inicial.

		// Primero compruebo si o es un IS-A de la clase Producto
		if (o instanceof Producto) {
			// creo una variable de tipo Producto llamado otro y se la asigno al
			// casting de o que es un object
//			Producto otro = (Producto) o;
			if (this.getValor() < o.getValor())
				ret = Tipo.MENOR;
			else if (this.getValor() == o.getValor())
				ret = Tipo.IGUAL;
			else
				ret = Tipo.MAYOR;
		} else {
			System.out.println("No se puede comparar con un no Producto.");
		}
		return ret;
	}

	@Override
	public int getValor() {
		// Devuelvo el valor del precio
		return (int) this.getPrecio();
	}

	@Override
	public void setValor(int valor) {
		this.setPrecio(valor);
	}

	//métodos de object sobreescritos
	@Override
	public Object clone() throws CloneNotSupportedException {
//		Permite hacer un clon devuelve un objeto nuevo 
//		con el mismo contenido que el original. 
//		Para que funcione, tiene que implementar la interfaz Cloneable
		return super.clone();
	}

	@Override
	public boolean equals(Object obj) {
//		Definimos la condicion por la que consideramos
//		dos objetos iguales, por ejemplo mismo codigo de Producto
//		o mismo nombre, lo que nosotros consideremos. 
		return super.equals(obj);
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	@Override
	public int hashCode() {
		// Contiene un entero que identifica este objeto
//		si el objeto es igual a otro, tienen que tener el mismo
//		valor de hash, tiene relación con el método equals()
		return super.hashCode();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
