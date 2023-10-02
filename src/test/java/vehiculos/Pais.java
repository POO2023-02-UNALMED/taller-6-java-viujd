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
		this.nombre=nombre;
	}
	
	public  int getCantidadVentas() {
		return CantidadVentas;
	}
	
	public void setCantidadVentas(int CantidadVentas) {
		this.CantidadVentas=CantidadVentas;
	}
	
	
	public static ArrayList<Pais> getListado() {
		return listado;
	}


	public static void setListado(ArrayList<Pais> listado) {
		Pais.listado = listado;
	}
	
	public Pais paisMasVendedor() {
		
		int maxventas=0;
		Pais paisMasVendedor=null;
		
		for (Pais pais:listado) {
			if(pais.getCantidadVentas() > maxventas) {
				maxventas = pais.getCantidadVentas();
				paisMasVendedor = pais;
			}
		}
		return paisMasVendedor;
		
		
	}

}
