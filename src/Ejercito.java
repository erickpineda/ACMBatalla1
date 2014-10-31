import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import acm.graphics.GImage;

public class Ejercito {

	private int posicionInicial;
	private int posicionFinal;
	private ArrayList<Soldado> soldados = null;
	private String nombreEjercito;
	private int direccion;
	private GImage unSoldado;
	
	/**
	 * Contructor de ejercitos para los soldados.
	 * 
	 * @param nombre
	 *            Nombre que llevara el ejercito
	 */
	public Ejercito(final String nombre) {

		if (nombreEjercito == null) {
			nombreEjercito = nombre;
		} else {
			nombreEjercito = "Ejercito 1";
		}
		soldados = new ArrayList<Soldado>();
		direccion = 1;
	}

	/**
	 * 
	 * @return el nombre del ejercito en las filas
	 */
	public String getNombreEjercito() {
		return nombreEjercito;
	}

	/**
	 * Agregar soldado individualmente.
	 * 
	 * @param soldado
	 *            parámetro que se le pasa al array de soldados
	 */
	public void alistarSoldadosEjercito(final Soldado soldado) {
		if (soldado == null) {
			soldados.add(soldado);
		}
	}
	
	public void agregarSoldadosEjercito(ArrayList<Soldado> soldado){
		soldado = soldados;
		Iterator<Soldado> itera = soldado.iterator();
		
		while (itera.hasNext()){
			Soldado s = itera.next();
			
			soldado.add(new Soldado(unSoldado));
		}
	}

	/**
	 * Forma el ejercito según la fila (derecha e izquierda).
	 * 
	 * @param posicionSoldados
	 *            posición para los 2 ejercitos
	 */
	public void formarSoldados(final int posicionSoldados) {
		
		
	}

	/**
	 * La dirección que llevara el ejercito de soldados.
	 * 
	 * @return retorna un 0 un x número para la posición final
	 */
	public int direccionSoldado() {

		return (posicionFinal - posicionInicial)
				/ Math.abs(posicionFinal - posicionInicial);

	}

	public void limiteLlegada() {

	}

	public void atacar() {

	}

}
