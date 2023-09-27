package ar.edu.unlam.pb2.testUnlam;

public class Aula {

	private Integer codigoAula;
	private Integer cantidadAlumno;

	public Aula(Integer codigoAula, Integer cantidadAlumno) {
		this.codigoAula=codigoAula;
		this.cantidadAlumno=cantidadAlumno;
	}


	public Integer getCodigoAula() {
		return codigoAula;
	}

	public void setCodigoAula(Integer codigoAula) {
		this.codigoAula = codigoAula;
	}

	public Integer getCantidadAlumno() {
		return cantidadAlumno;
	}

	public void setCantidadAlumno(Integer cantidadAlumno) {
		this.cantidadAlumno = cantidadAlumno;
	}
	
	

}
