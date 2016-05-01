package datos;

import java.util.ArrayList;

import datos.interfaces.Ordenable;

public class ArrayListOrdenable extends ArrayList<Ordenable> {
//	Tengo que ir ordenando conforme voy insertando datos, el m�todo que nos puede
//	dar problemas es el m�todo a�adir. Sobreescribo el m�todo de a�adir del padre.

//	Me centro �nicamente en este m�todo
	@Override
	public boolean add(Ordenable e) {
//		Recorro el array y busca en que posici�n colocarlo
//		la condicion es que la i sea menor que el tama�o del array
		for(int i=0;i<this.size();i++){
//			Tiene que obtener el valor del elemento que le estamos pasando.
			if(this.get(i).ordena(e) == Ordenable.Tipo.MAYOR){
//				En el momento que encontremos el mayor lo ponemos en esa posici�n.
				this.add(i,e); 
				break; //una vez encontrado lo rompo con el break
			}
		}
	}
}
