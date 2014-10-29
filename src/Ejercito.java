import java.util.ArrayList;
import java.util.List;

public class Ejercito {
	
	private ArrayList<Soldado> soldados = null;
	private String nombreEjercito;
	private int direccion;
	
	public Ejercito(final String nombre){
		
		if (nombreEjercito == null){
			nombreEjercito = nombre;
		} else {
			nombreEjercito = "Ejercito 1";
		}
		soldados = new ArrayList<Soldado>();
		direccion = 1;
	}
	
	public String getNombreEjercito(){
		return nombreEjercito;
	}
	
	public void alistarSoldados(final Soldado soldado){
		if (soldado == null){
			soldados.add(soldado);
		}
	}
	
	public void formarSoldados(final int posicionSoldados){
		
	}
	
	public int direccionSoldado(){
		return direccion;
	}
	
	public void atacar(){
		
	}
	
}
