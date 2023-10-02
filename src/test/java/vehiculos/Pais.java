package vehiculos;
import java.util.ArrayList;

public class Pais {
	
	private String nombre;
	private static ArrayList<Pais> listado=new ArrayList<Pais>();
	private static int CantidadVentas;
	
	
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
	
	public static  int getCantidadVentas() {
		return CantidadVentas;
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
		
		for (int i=0; i< Pais.listado.size(); i++) {
			int CantidadVentas= Pais.getCantidadVentas();
			
			if (CantidadVentas>maxventas) {
				maxventas=CantidadVentas;
				paisMasVendedor= listado.get(i);
			}
		}
		return paisMasVendedor;
		
		
	}

}
