package iua.edu.ar.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "sistema_externo")
public class SistemaExterno {

	public String checkBasicData() {
		if (getOrden().getNumeroOrden() <= 0)
			return "El atributo 'NumeroOrden' debe ser mayor a 0";
		
		if (getOrden() == null)
			return "El atributo 'orden' es obligatorio";

		if (getOrden().getCodigoExterno() == null || getOrden().getCodigoExterno().trim().length() == 0)
			return "El atributo 'orden.codigoExterno' es obligatorio";

		return null;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "id_orden")
	private Orden orden;

	@Column(length = 256, nullable = true)
	private String comentarios;

	@Column(columnDefinition = "TINYINT NOT NULL DEFAULT 0")
	private boolean recibida;

	public Orden getOrden() {
		return orden;
	}

	public void setOrden(Orden orden) {
		this.orden = orden;
	}

	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	public boolean isRecibida() {
		return recibida;
	}

	public void setRecibida(boolean recibida) {
		this.recibida = recibida;
	}

}
