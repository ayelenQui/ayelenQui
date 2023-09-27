package ar.edu.unlam.pb2.testUnlam;

import java.util.Objects;

public class Curso {

	private Integer codigoCurso;
	private CicloLectivo ciclo;
	private Comision comision;
	private Aula aula;
	private Materia materia;

	public Curso(Integer codigoCurso, CicloLectivo ciclo, Comision comision, Aula aula, Materia materia1) {
		this.codigoCurso=codigoCurso;
		this.ciclo=ciclo;
		this.comision=comision;
		this.aula=aula;
		this.materia=materia;
	}

	public Integer getCodigoCurso() {
		return codigoCurso;
	}

	public void setCodigoCurso(Integer codigoCurso) {
		this.codigoCurso = codigoCurso;
	}

	public CicloLectivo getCiclo() {
		return ciclo;
	}

	public void setCiclo(CicloLectivo ciclo) {
		this.ciclo = ciclo;
	}

	public Comision getComision() {
		return comision;
	}

	public void setComision(Comision comision) {
		this.comision = comision;
	}

	public Aula getAula() {
		return aula;
	}

	public void setAula(Aula aula) {
		this.aula = aula;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigoCurso);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Curso other = (Curso) obj;
		return Objects.equals(codigoCurso, other.codigoCurso);
	}

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	

	
	
}
