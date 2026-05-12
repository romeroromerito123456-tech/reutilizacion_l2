package py.edu.facitec.odonto.modelo.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table (name="especialidad")
public class Especialidad {
	@Id
	@GeneratedValue
	private int id;
	@Column(nullable = false)
	private String nombre;
}
