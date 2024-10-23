import java.util.ArrayList;

public class Ciudad {
	private String nombreCiudad;
	private int codigoPostal;
	private ArrayList<Tienda> tiendas = new ArrayList<Tienda>();

	public String getNombreCiudad() {
		return this.nombreCiudad;
	}

	public void setNombreCiudad(String nombreCiudad) {
		this.nombreCiudad = nombreCiudad;
	}

	public int getCodigoPostal() {
		return this.codigoPostal;
	}

	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public boolean agregarTienda(Tienda tienda) {
		throw new UnsupportedOperationException();
	}

	public boolean eliminarTienda(Tienda tienda) {
		throw new UnsupportedOperationException();
	}

	public boolean modificarTienda(Tienda tienda) {
		throw new UnsupportedOperationException();
	}

	public void obtenerTiendas() {
		throw new UnsupportedOperationException();
	}

	public boolean asignarEmpleado(Empleado empleado) {
		throw new UnsupportedOperationException();
	}
}