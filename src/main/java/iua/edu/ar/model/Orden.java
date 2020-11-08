package iua.edu.ar.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "ordenes")
public class Orden implements Serializable {

	private static final long serialVersionUID = -4828422833183668198L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(length = 100, nullable = false)
	private double numeroOrden;

	@Column(length = 100)
	@Temporal(javax.persistence.TemporalType.TIMESTAMP)
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
	private Date fechaRecepcionPesajeInicial;

	@Column(length = 100, nullable = false)
	@Temporal(javax.persistence.TemporalType.TIMESTAMP)
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
	private Date fechaPrevistaCarga;

	@OneToOne(cascade = CascadeType.ALL)
	private Cliente cliente;

	@OneToOne(cascade = CascadeType.ALL)
	private Producto producto;

	@OneToOne(cascade = CascadeType.ALL)
	private Camion camion;

	@OneToOne(cascade = CascadeType.ALL)
	private Chofer chofer;

	@Column(length = 100)
	private int estado;

	@Column(length = 100, nullable = false)
	private double preset;

	// External code

	@Column(length = 50, nullable = true, unique = true)
	private String codigoExterno;

	public Orden() {

	}

	public Orden(Orden orden) {
		this.codigoExterno = orden.codigoExterno;
		this.numeroOrden = orden.numeroOrden;
		this.camion = orden.getCamion();
		this.chofer = orden.getChofer();
		this.cliente = orden.getCliente();
		this.producto = orden.getProducto();
		this.fechaPrevistaCarga = orden.fechaPrevistaCarga;
		this.preset = orden.preset;

	}

	// Getters and setters

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getNumeroOrden() {
		return numeroOrden;
	}

	public void setNumeroOrden(double numeroOrden) {
		this.numeroOrden = numeroOrden;
	}

	public Date getFechaRecepcionPesajeInicial() {
		return fechaRecepcionPesajeInicial;
	}

	public void setFechaRecepcionPesajeInicial(Date fechaRecepcionPesajeInicial) {
		this.fechaRecepcionPesajeInicial = fechaRecepcionPesajeInicial;
	}

	public Date getFechaPrevistaCarga() {
		return fechaPrevistaCarga;
	}

	public void setFechaPrevistaCarga(Date fechaPrevistaCarga) {
		this.fechaPrevistaCarga = fechaPrevistaCarga;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Camion getCamion() {
		return camion;
	}

	public void setCamion(Camion camion) {
		this.camion = camion;
	}

	public Chofer getChofer() {
		return chofer;
	}

	public void setChofer(Chofer chofer) {
		this.chofer = chofer;
	}

	public String getCodigoExterno() {
		return codigoExterno;
	}

	public void setCodigoExterno(String codigoExterno) {
		this.codigoExterno = codigoExterno;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public double getPreset() {
		return preset;
	}

	public void setPreset(double preset) {
		this.preset = preset;
	}

}
