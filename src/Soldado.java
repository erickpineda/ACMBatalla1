import acm.graphics.GImage;
import acm.graphics.GRectangle;

public class Soldado {

	private GImage soldadoImg;
	private int velocidadSoldado = 3;
	private int posisicionSoldado = 0;
	/**
	 * 
	 * @param tarmaImagen Ubicación de la imagen
	 * @param x Anchura de la imagen
	 * @param y Altura de la imagen
	 */
	public Soldado(final GImage soldadoImagen, final int posicion) {
		soldadoImg = soldadoImagen;
		posisicionSoldado = posicion;
	}
	
	public Soldado(final GImage soldadoImagen) {
		soldadoImg = soldadoImagen;
	}
	
	/**
	 * @return Retorna a la imagen
	 */
	public GImage getSoldadoImagen() {
		return soldadoImg;
	}

	/**
	 * @return Retorna la posición de la imagen
	 */
	public double getPosicionSoldado() {
		return soldadoImg.getX() + soldadoImg.getWidth();
	}

	/**
	 * @param x Cambia la ubicación respecto a la anchura de la imagen
	 * @param y Cambia la ubicación respecto a la altura de la imagen
	 */
	public void setPosicioSoldado(final double x, final double y) {
		soldadoImg.setLocation(x, y);
	}

	/**
	 * @param x Mueve la imagen respecto a la anchura
	 * @param y Mueve la imagen respecto a la altura
	 */
	public void moverSoldado(final double x, final double y) {
		soldadoImg.move(x, y);
	}

	/**
	 * @return Retorna la velocidad de la imagen
	 */
	public int getVelocidadSoldado() {
		return velocidadSoldado;
	}

	/**
	 * @param x Cambia la anchura de la imagen
	 * @param y Cambia la altura de la imagen
	 */
	public void setSizeSoldado(final double x, final double y) {
		soldadoImg.setSize(x, y);
	}
}
