import java.util.ArrayList;
import java.util.Date;

public class Compra {
	private int numeroCompra;
	private Date fechaCompra;
	private int totalCompra;
	private String formaPago;
	private Cliente cliente;
	private ArrayList<Producto> productos = new ArrayList<Producto>();

	public int getNumeroCompra() {
		return this.numeroCompra;
	}

	public void setNumeroCompra(int numeroCompra) {
		this.numeroCompra = numeroCompra;
	}

	public Date getFechaCompra() {
		return this.fechaCompra;
	}

	public void setFechaCompra(Date fechaCompra) {
		this.fechaCompra = fechaCompra;
	}

	public int getTotalCompra() {
		return this.totalCompra;
	}

	public void setTotalCompra(int totalCompra) {
		this.totalCompra = totalCompra;
	}

	public String getFormaPago() {
		return this.formaPago;
	}

	public void setFormaPago(String formaPago) {
		this.formaPago = formaPago;
	}
}