package datos;

import java.util.ArrayList;

import datos.interfaces.Ordenable;

public class ArrayListOrdenable extends ArrayList<Ordenable> {
//	Tengo que ir ordenando conforme voy insertando datos, el método que nos puede
//	dar problemas es el método añadir. Sobreescribo el método de añadir del padre.

//	Me centro únicamente en este método
	@Override
	public boolean add(Ordenable e) {
//		Recorro el array y busca en que posición colocarlo
//		la condicion es que la i sea menor que el tamaño del array
		for(int i=0;i<this.size();i++){
//			Tiene que obtener el valor del elemento que le estamos pasando.
			if(this.get(i).ordena(e) == Ordenable.Tipo.MAYOR){
//				En el momento que encontremos el mayor lo ponemos en esa posición.
				this.add(i,e); 
				break; //una vez encontrado lo rompo con el break
			}
		}
	}
}
