package py.edu.facitec.odonto.modelo.entidades;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table (name="paciente")
public class Paciente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column (nullable = false)
	private String nombre;
	@Column (nullable = false)
	private String apellido;
	@Column (nullable = false, unique = true)
	private String documento;
	private String telefono;
	private String email;
	private String direccion;
	private String genero;
	private String profesion;
	
	
	
	//relacion con agendamiento
	@OneToMany(mappedBy = "paciente", cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private List<Agendamiento> agendamientos;
	
	//relacion con consulta
	@OneToMany(mappedBy = "paciente", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Consulta> consultas;
}
