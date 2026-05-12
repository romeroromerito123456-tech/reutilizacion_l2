package py.edu.facitec.odonto.modelo.entidades;

import java.time.LocalTime;

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
@Table (name="horario_odontologo")
public class HorarioOdontologo {
	
	@Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
	private int id;
	@Column(name = "hora_inicio")
	private LocalTime horarioInicio;
	@Column(name = "hora_fin")
	private LocalTime horarioFin;
	@Column(nullable = false, columnDefinition = "BOOLEAN DEFAULT TRUE")
	private boolean estado;
	
	
	
	//relacion con odontologo
	@ManyToOne (fetch = FetchType.LAZY)
	@JoinColumn(name = "odontologo_id", nullable = false)
	private Odontologo odontologo;
}
