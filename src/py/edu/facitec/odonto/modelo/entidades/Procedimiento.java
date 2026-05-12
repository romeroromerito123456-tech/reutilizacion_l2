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
@Table(name="procedimiento")
public class Procedimiento {
	@Id 	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(nullable = false, length = 100)
	private String nombre;
	@Column(columnDefinition = "TEXT")

	private String descripcion;
	
	@Column(nullable = false)
	private double monto;
	
	@OneToMany(mappedBy = "procedimiento", cascade = CascadeType.ALL, fetch =  FetchType.LAZY)
	private List<ProcedimientoConsulta> procedimientoConsultas;
}
