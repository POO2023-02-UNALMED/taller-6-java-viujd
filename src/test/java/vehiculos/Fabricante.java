package vehiculos;
import java.util.ArrayList;

public class Fabricante {
	
	private String nombre;
	private Pais pais;
	private static ArrayList<Fabricante> listado=new ArrayList<Fabricante>();
	private static int CantidadVentas;
	
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
	
	public static  int getCantidadVentas() {
		return CantidadVentas;
	}
	
	
	public static ArrayList<Fabricante> getListado() {
		return listado;
	}


	public static void setListado(ArrayList<Fabricante> listado) {
		Fabricante.listado = listado;
	}
	
	public Fabricante paisMasVendedor() {
		
		int maxventas=0;
		Fabricante fabricaMasVendedor=null;
		
		for (int i=0; i< Fabricante.listado.size(); i++) {
			int CantidadVentas= Fabricante.getCantidadVentas();
			
			if (CantidadVentas>maxventas) {
				maxventas=CantidadVentas;
				fabricaMasVendedor= listado.get(i);
			}
		}
		return fabricaMasVendedor;
		
		
	}


}
