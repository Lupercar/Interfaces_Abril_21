package datos.interfaces;
/**
 * Una interfaz es una clase abstracta pura
 * Si alquien quiere ser Ordenable le obligo a tener todo que hay en la interfaz.
 */
public interface Ordenable {
//	Las variables son publicas, estaticas y final.
//	Por no lo tanto, no es necesario poner los modificacores por que el 
//	compilador lo hace por nosotros. Pero los podemos poner. 
	
//	double PI = 3.14; // Es public static final => Una constante. 
//	Es equivalente esto a poner:
	public static final double PI = 3.14;
	
//	Los metodos son public(accesible desde todas partes) abstract (sin codigo):
	enum Tipo { MENOR, IGUAL, MAYOR, INDEFINIDO }; 
	Tipo ordena(Ordenable o); //nos indica si es MENOR, IGUAL o MAYOR
	int getValor(); //nos da el valor almacenado
	void setValor(int valor); 
}
