import java.util.ArrayList;

public class Tienda {
	private String nombreTienda;
	private String direccion;
	private String horaApertura;
	private String horaCierre;
	private ArrayList<Empleado> empleados = new ArrayList<Empleado>();
	private Inventario inventario;
	private ArrayList<Cliente> clientes = new ArrayList<Cliente>();

	public String getNombreTienda() {
		return this.nombreTienda;
	}

	public void setNombreTienda(String nombreTienda) {
		this.nombreTienda = nombreTienda;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getHoraApertura() {
		return this.horaApertura;
	}

	public void setHoraApertura(String horaApertura) {
		this.horaApertura = horaApertura;
	}

	public String getHoraCierre() {
		return this.horaCierre;
	}

	public void setHoraCierre(String horaCierre) {
		this.horaCierre = horaCierre;
	}

	public boolean agregarEmpleado(Empleado empleado) {
		throw new UnsupportedOperationException();
	}

	public boolean eliminarEmpleado(Empleado empleado) {
		throw new UnsupportedOperationException();
	}

	public boolean modificarEmpleado(Empleado empleado) {
		throw new UnsupportedOperationException();
	}

	public void obtenerEmpleados() {
		throw new UnsupportedOperationException();
	}

	public Empleado buscarEmpleado(int id) {
		throw new UnsupportedOperationException();
	}

	public boolean registrarCliente(Cliente cliente) {
		throw new UnsupportedOperationException();
	}

	public boolean modificarCliente(Cliente cliente) {
		throw new UnsupportedOperationException();
	}

	public boolean eliminarCliente(Cliente cliente) {
		throw new UnsupportedOperationException();
	}

	public void consultarClientes() {
		throw new UnsupportedOperationException();
	}

	public Cliente buscarCliente(String nombre) {
		throw new UnsupportedOperationException();
	}

	public boolean registrarCompra(Cliente cliente, Compra compra) {
		throw new UnsupportedOperationException();
	}

	public boolean actualizarInventario() {
		throw new UnsupportedOperationException();
	}

	public void consultarCompras(Cliente cliente) {
		throw new UnsupportedOperationException();
	}

	public void consultarInventario(Producto producto) {
		throw new UnsupportedOperationException();
	}
}