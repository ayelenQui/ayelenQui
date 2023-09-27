package ar.edu.unlam.pb2.testUnlam;

public class Comision {

	private Integer codigoomision;
	private Materia materia;
	private CicloLectivo segundoCuatrimestre;
	private Turnos turno;

	public Comision(Integer codigoomision, Materia materia, CicloLectivo segundoCuatrimestre, Turnos turno) {
		this.codigoomision=codigoomision;
		this.materia=materia;
		this.segundoCuatrimestre=segundoCuatrimestre;
		this.turno=turno;
	}

	public Integer getCodigoomision() {
		return codigoomision;
	}

	public void setCodigoomision(Integer codigoomision) {
		this.codigoomision = codigoomision;
	}

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia pb1) {
		this.materia = pb1;
	}

	public CicloLectivo getSegundoCuatrimestre() {
		return segundoCuatrimestre;
	}

	public void setSegundoCuatrimestre(CicloLectivo segundoCuatrimestre) {
		this.segundoCuatrimestre = segundoCuatrimestre;
	}

	public Turnos getTurno() {
		return turno;
	}

	public void setTurno(Turnos turno) {
		this.turno = turno;
	}
	
	
	
	
}
