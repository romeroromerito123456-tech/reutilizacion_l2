package py.edu.facitec.odonto.modelo.entidades;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table (name= "agendamiento")
public class Agendamiento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column ( name = "fecha_hora_inicio")
	private LocalDateTime fechaHorarioInicio;
	@Column(name = "fecha_hora_fin")
	private LocalDateTime fechaHoraFin;
	@Column(columnDefinition = "TEXT")
	private String descripcion;
	
	
	//relacion con paciente
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "paciente_id", nullable = false)
	private Paciente paciente;
	
	
	//relacion con odontologo
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "odontologo_id", nullable = false)
	private Odontologo odontologo;
}
