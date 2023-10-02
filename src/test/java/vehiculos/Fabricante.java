package vehiculos;
import java.util.ArrayList;

public class Fabricante {
	
	private String nombre;
	private Pais pais;
	private static ArrayList<Fabricante> listado=new ArrayList<Fabricante>();
	private int CantidadVentas;
	
	public Fabricante (String nombre, Pais pais) {
		this.nombre=nombre;
		this.pais=pais;
		Fabricante.listado.add(this);
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Pais getPais() {
		return pais;
	}
	
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
	public int getCantidadVentas() {
		return CantidadVentas;
	}

	public void setCantidadVentas(int CantidadVentas) {
		this.CantidadVentas = CantidadVentas;
	}

	public void agregarVenta() {
		this.setCantidadVentas(this.getCantidadVentas() + 1); 
		this.pais.agregarVentas();
	}
	
	public static Fabricante fabricaMayorVentas() {
		Fabricante f = null;
		int mayorVentas = 0;
		for(Fabricante fabricante: listado) {
			if(fabricante.getCantidadVentas() > mayorVentas) {
				mayorVentas = fabricante.getCantidadVentas();
				f = fabricante;
			}
		}
		return f;
	}
}