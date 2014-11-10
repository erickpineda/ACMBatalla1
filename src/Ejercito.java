import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import acm.graphics.GImage;

public class Ejercito {

	private int posicionInicial = 0;
	private int posicionFinal = 1100;
	private ArrayList<Soldado> soldados;
	private String nombreEjercito;
	private int direccion;
	private GImage unSoldado;
	private int cantidadSoldados = (int) Math.random() * 20 + 15;

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

	public void agregarSoldadosEjercito(ArrayList<Soldado> soldado,
			String aleatorio) {
		soldado = soldados;

		for (int i = 0; i < cantidadSoldados; i++) {
			soldado.add(new Soldado(aleatorio));
		}
	}

	public ArrayList<Soldado> soldadosFormacionInicial(
			ArrayList<Soldado> soldado) {
		soldado = soldados;

		for (int i = 0; i < soldado.size(); i++) {
			soldado.get(i).setPosicionSoldado(0,
					i * soldado.get(i).getSoldadoImagen().getHeight());

		}
		return soldado;
	}

	/**
	 * Forma el ejercito según la fila (derecha e izquierda).
	 * 
	 * @param posicionSoldados
	 *            posición para los 2 ejercitos
	 */
	public void formarSoldados(final int posicionSoldados) {

		if (posicionSoldados == 0) {

		}
	}

	public void moverEjercito(ArrayList<Soldado> soldado) {
		soldado = soldados;
		Iterator<Soldado> itera = soldado.iterator();

		while (itera.hasNext()) {
			Soldado s = itera.next();

			for (int i = 0; i < posicionFinal; i++) {
				for (Soldado m : soldado) {
					m.moverSoldado(Math.random() * 15 + 10, 0);
					s.getSoldadoImagen().pause(30);
				}
			}
		}

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

		if (posicionInicial == posicionFinal) {

		}

	}

	public void atacar() {

	}

}
