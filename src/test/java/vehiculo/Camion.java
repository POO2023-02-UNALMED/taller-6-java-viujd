package vehiculo;

public class Camion extends Vehiculo{
	
	int ejes;
	static int cantidadCamion;
	
	public Camion (String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, Fabricante fabricante, int ejes) {
		super(placa, 2, 80, nombre, precio, peso,"4X2", fabricante);
		this.ejes=ejes;
		cantidadCamion+=1;
	}
	
	public int getEjes() {
		return ejes;
	}
	
	public void setEjetes(int ejes) {
		this.ejes=ejes;
	}

}
