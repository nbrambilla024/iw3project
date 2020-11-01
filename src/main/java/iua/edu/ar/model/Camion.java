package iua.edu.ar.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "camiones")
public class Camion implements Serializable {

	private static final long serialVersionUID = -1970690932122582652L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(length = 100)
	private double patente;

	@Column(length = 100, nullable = true)
	private String descripcion;

	@Column(length = 100)
	private double cisternado;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getPatente() {
		return patente;
	}

	public void setPatente(double patente) {
		this.patente = patente;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getCisternado() {
		return cisternado;
	}

	public void setCisternado(double cisternado) {
		this.cisternado = cisternado;
	}

}
