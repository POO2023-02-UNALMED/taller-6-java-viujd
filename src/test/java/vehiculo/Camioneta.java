package vehiculo;

public class Camioneta extends Vehiculo{
	
	boolean volco;
	static int cantidadCamioneta;
	
	public Camioneta (String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, Fabricante fabricante, boolean volco) {
		super(placa, puertas, 90, nombre, precio, peso,"4X4", fabricante);
		this.volco=volco;
		cantidadCamioneta +=1;
	}
	
	public boolean isVolco() {
		return volco;
	}
	
	public void setVolco(boolean volco) {
		this.volco=volco;
	}

	
}
