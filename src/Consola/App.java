package Consola;

import datos.Perro;
import datos.Producto;

public class App {

	public static void main(String[] args) throws CloneNotSupportedException {
		// creo dos productos y los comparo.
		Producto p1 = new Producto(1, "Producto1", 1.00);
		Producto p2 = new Producto(2, "Producto2", 2.00);

		// si declaro un perro
		Perro miPerro = new Perro(1, "Perro1");

		System.out.println(p1.ordena(p2));

		p2 = (Producto) p1.clone(); // hago casting y pongo throws
		System.out.println("Codigo de p2:" + p2.getCodigo()); //veo codigo de p2 que es el de p1
	}
}
