package py.edu.facitec.odonto.modelo.entidades;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="consulta")
public class Consulta {
	@Id
	@GeneratedValue
	private int id;
	@Column(name = "motivo_consulta", columnDefinition = "TEXT")
	private String motivoConsulta;
	private LocalDateTime fechaHora;
	private String observaciones;
	private double precioTotal;
	
	//relacion con paciente
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "paciente_id", nullable = false)
	private Paciente paciente;
	
	//relacion con odontologo
	@ManyToOne
	@JoinColumn(name="odontologo_id", nullable = false)
	private Odontologo odontologo;
	
	//relacion con procedimiento_consulta
	@OneToMany(mappedBy = "consulta",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private List<ProcedimientoConsulta> procedimiento_consulta;
	
	//relacion con receta
	@OneToOne(mappedBy = "consulta", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Receta receta;
}
