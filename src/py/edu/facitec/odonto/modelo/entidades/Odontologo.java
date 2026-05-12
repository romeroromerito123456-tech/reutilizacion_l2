package py.edu.facitec.odonto.modelo.entidades;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table (name="odontologo")
public class Odontologo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable = false)
	private String nombre;
	@Column(nullable = false)
	private String apellido;
	@Column(nullable = false, unique = true)
	private String documento;
	private String telefono;
	private String email;
	private String direccion;
	private String numeroRegistro;
	
	//relacion con especialidad
	@ManyToOne
	@JoinColumn(name = "especialidad_id", nullable = false)
	private Especialidad especialidad;
	
	//relacion con horario_odontologo
	@OneToMany(mappedBy = "odontologo", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	List<HorarioOdontologo> horarios;
	
	//relacion con agendamiento
	@OneToMany(mappedBy = "odontologo", cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private List<Agendamiento> agendamientos;
}
