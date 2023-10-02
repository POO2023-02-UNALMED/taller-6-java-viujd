package vehiculos;

public class Camion extends Vehiculo{
	
	private int ejes;
	static int cantidadCamion;
	
	public Camion (String placa, String nombre, int precio, int peso, Fabricante fabricante, int ejes) {
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
