package vehiculos;

import java.util.ArrayList;

public class Pais {
	private String nombre;
	private int vehiculosFabricados;
	private static ArrayList<Pais> listadoPaises = new ArrayList<Pais>();
	
	public Pais(String nombre) {
		this.nombre = nombre;
		Pais.listadoPaises.add(this);
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getVehiculosFabricados() {
		return this.vehiculosFabricados;
	}
	
	public void setVehiculosFabricados(int cantidad) {
		this.vehiculosFabricados = cantidad;
	}
	
	public void fabricarVehiculo() {
		this.vehiculosFabricados++;
	}
	
	public static Pais paisMasVendedor() {
		Pais mayorVendedor = listadoPaises.get(0);
		for (int i = 1; i < listadoPaises.size(); i++) {
			if (listadoPaises.get(i).getVehiculosFabricados() > mayorVendedor.getVehiculosFabricados()) {
				mayorVendedor = listadoPaises.get(i);
			}
		}
		return mayorVendedor;
	}
	
}