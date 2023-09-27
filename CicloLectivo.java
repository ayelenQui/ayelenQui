package ar.edu.unlam.pb2.testUnlam;

import java.time.LocalDate;
import java.util.Objects;

public class CicloLectivo {

	private String codigoCiclo;
	private LocalDate fechaInicioCicloLectivo;
	private LocalDate fechaFinalizacionCicloLectivo;
	private LocalDate fechaInicioInscripcion;
	private LocalDate fechaFinalizacionInscripcion;

	public CicloLectivo(String codigoCiclo, LocalDate fechaInicioCicloLectivo, LocalDate fechaFinalizacionCicloLectivo,
			LocalDate fechaInicioInscripcion, LocalDate fechaFinalizacionInscripcion) {
		this.codigoCiclo=codigoCiclo;
		this.fechaInicioCicloLectivo=fechaInicioCicloLectivo;
		this.fechaFinalizacionCicloLectivo=fechaFinalizacionCicloLectivo;
		this.fechaInicioInscripcion=fechaInicioInscripcion;
		this.fechaFinalizacionInscripcion=fechaFinalizacionInscripcion;
	}

	public String getCodigoCiclo() {
		return codigoCiclo;
	}

	public void setCodigoCiclo(String codigoCiclo) {
		this.codigoCiclo = codigoCiclo;
	}

	public LocalDate getFechaInicioCicloLectivo() {
		return fechaInicioCicloLectivo;
	}

	public void setFechaInicioCicloLectivo(LocalDate fechaInicioCicloLectivo) {
		this.fechaInicioCicloLectivo = fechaInicioCicloLectivo;
	}

	public LocalDate getFechaFinalizacionCicloLectivo() {
		return fechaFinalizacionCicloLectivo;
	}

	public void setFechaFinalizacionCicloLectivo(LocalDate fechaFinalizacionCicloLectivo) {
		this.fechaFinalizacionCicloLectivo = fechaFinalizacionCicloLectivo;
	}

	public LocalDate getFechaInicioInscripcion() {
		return fechaInicioInscripcion;
	}

	public void setFechaInicioInscripcion(LocalDate fechaInicioInscripcion) {
		this.fechaInicioInscripcion = fechaInicioInscripcion;
	}

	public LocalDate getFechaFinalizacionInscripcion() {
		return fechaFinalizacionInscripcion;
	}

	public void setFechaFinalizacionInscripcion(LocalDate fechaFinalizacionInscripcion) {
		this.fechaFinalizacionInscripcion = fechaFinalizacionInscripcion;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigoCiclo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CicloLectivo other = (CicloLectivo) obj;
		return Objects.equals(codigoCiclo, other.codigoCiclo);
	}
	

}
