package iua.edu.ar.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

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
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaRecepcionPesajeInicial;

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

}
