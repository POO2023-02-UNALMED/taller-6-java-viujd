package vehiculos;
import java.util.ArrayList;

public class Fabricante {
	private String nombre;
	private Pais pais;
	private int vehiculosFabricados;
	private static ArrayList<Fabricante> listadoFabricantes = new ArrayList<Fabricante>();
	
	public Fabricante(String nombre, Pais pais) {
		this.nombre = nombre;
		this.pais = pais;
		Fabricante.listadoFabricantes.add(this);
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Pais getPais() {
		return this.pais;
	}
	
	public void setPais(Pais pais) {
		this.pais = pais;
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
	
	public static Fabricante fabricaMayorVentas() {
		Fabricante mayorVendedor = listadoFabricantes.get(0);
		for (int i = 1; i < listadoFabricantes.size(); i++) {
			if (listadoFabricantes.get(i).getVehiculosFabricados() > mayorVendedor.getVehiculosFabricados()) {
				mayorVendedor = listadoFabricantes.get(i);
			}
		}
		return mayorVendedor;
	}
	
}