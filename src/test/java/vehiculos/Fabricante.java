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
		this.nombre=nombre;
	}
	
	public Pais getPais() {
		return pais;
	}
	
	public void setPais (Pais pais) {
		this.pais=pais;
	}
	
	public int getCantidadVentas() {
		return CantidadVentas;
	}
	
	public void setCantidadVentas(int CantidadVentas) {
		this.CantidadVentas=CantidadVentas;
	}
	
	public static ArrayList<Fabricante> getListado() {
		return listado;
	}


	public static void setListado(ArrayList<Fabricante> listado) {
		Fabricante.listado = listado;
	}
	
	public void agregarVenta() {
		this.setCantidadVentas(this.getCantidadVentas() + 1);
	}
	
	public Fabricante fabricaMasVendedora() {
		
		int maxventas=0;
		Fabricante fabricaMasVendedora=null;
		
		for(Fabricante fabricante: listado) {
			if(fabricante.getCantidadVentas() > maxventas) {
				maxventas = fabricante.getCantidadVentas();
				fabricaMasVendedora = fabricante;
			}
		}
		return fabricaMasVendedora;
		
		
		
		
	}


}
