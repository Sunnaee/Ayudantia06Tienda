import java.util.ArrayList;

public class Cliente {
	private String nombreCliente;
	private int numeroCliente;
	private ArrayList<Compra> compras = new ArrayList<Compra>();

	public String getNombreCliente() {
		return this.nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public int getNumeroCliente() {
		return this.numeroCliente;
	}

	public void setNumeroCliente(int numeroCliente) {
		this.numeroCliente = numeroCliente;
	}

	public boolean agregarProductoACompra(Producto producto) {
		throw new UnsupportedOperationException();
	}

	public boolean eliminarProductoDeCompra(Producto producto) {
		throw new UnsupportedOperationException();
	}

	public void obtenerCompras() {
		throw new UnsupportedOperationException();
	}

	public Compra buscarCompra(int numero) {
		throw new UnsupportedOperationException();
	}
}