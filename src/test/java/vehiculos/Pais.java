package vehiculos;
import java.util.ArrayList;

public class Pais {
	
	private String nombre;
	private static ArrayList<Pais> listado=new ArrayList<Pais>();
	private int CantidadVentas;
	
	
	public Pais(String nombre) {
		this.nombre=nombre;
		listado.add(this);
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getCantidadVentas() {
		return CantidadVentas;
	}

	public void setCantidadVentas(int CantidadVentas) {
		this.CantidadVentas = CantidadVentas;
	}

	public void agregarVentas() {
		this.setCantidadVentas(this.getCantidadVentas() + 1);
	}
	
	public static Pais paisMasVendedor() {
		int mayorVentas = 0;
		Pais p = null;
		for(Pais pais: listado) {
			if(pais.getCantidadVentas() > mayorVentas) {
				mayorVentas = pais.getCantidadVentas();
				p = pais;
			}
		}
		return p;
	}
}