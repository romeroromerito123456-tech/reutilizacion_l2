package py.edu.facitec.odonto.modelo.entidades;

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
@Table(name = "procedimiento_consulta")
public class ProcedimientoConsulta {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    // ── Campo extra de la tabla puente ──────────────────────────────────────
    @Column(name = "descripcion_tratamiento", columnDefinition = "TEXT")
    private String descripcionTratamiento;

    // ── FK hacia Consulta ────────────────────────────────────────────────────
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "consulta_id", nullable = false)
    private Consulta consulta;

    // ── FK hacia Procedimiento ───────────────────────────────────────────────
    // mappedBy = "procedimientoConsultas" en Procedimiento.java apunta aquí
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "procedimiento_id", nullable = false)
    private Procedimiento procedimiento;
}
